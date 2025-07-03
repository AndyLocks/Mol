use crate::config::CONFIG;
use reqwest::blocking::{Client, multipart};
use std::error::Error;
use std::io;
use std::io::Read;
use std::ops::Deref;
use std::path::PathBuf;

pub fn execute(
    file: Option<PathBuf>,
    script: Option<String>,
) -> Result<(), Box<dyn Error>> {
    let client = Client::new();
    let url = format!("{}/import", CONFIG.deref().url.clone());

    if file.is_some() {
        let file = file.expect("File path cannot be null");

        let file_name = file
            .file_name()
            .and_then(|s| s.to_str())
            .ok_or("Invalid file name")?;

        let file_part = multipart::Part::file(&file)?.file_name(file_name.to_string());

        let form = multipart::Form::new().part("file", file_part);

        client.post(&url).multipart(form).send()?;
    }

    if script.is_some() {
        let script = script.expect("Script cannot be null");

        let part = multipart::Part::text(script)
            .file_name("mol.mol")
            .mime_str("text/plain")?;

        let form = multipart::Form::new().part("file", part);

        client.post(&url).multipart(form).send()?;
    }

    let mut buffer = String::new();

    if atty::isnt(atty::Stream::Stdin) {
        io::stdin().read_to_string(&mut buffer).unwrap();

        let part = multipart::Part::text(buffer)
            .file_name("mol.mol")
            .mime_str("text/plain")?;

        let form = multipart::Form::new().part("file", part);

        client.post(&url).multipart(form).send()?;
    }

    Ok(())
}
