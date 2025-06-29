use std::error::Error;
use std::path::PathBuf;
use reqwest::{multipart, Client};
use crate::constants::BASE_URL;

pub async fn execute(file: PathBuf, client: &Client) -> Result<(), Box<dyn Error>> {
    let url = format!("{}/import", BASE_URL);

    let file_name = file
        .file_name()
        .and_then(|s| s.to_str())
        .ok_or("Invalid file name")?;

    let file_part = multipart::Part::file(&file).await?.file_name(file_name.to_string());

    let form = multipart::Form::new().part("file", file_part);

    client.post(url).multipart(form).send().await?;

    Ok(())
}