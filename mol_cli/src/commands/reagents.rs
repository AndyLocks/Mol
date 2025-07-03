use crate::config::CONFIG;
use reqwest::blocking::Client;
use std::error::Error;
use std::ops::Deref;

pub fn execute(name: String, json: bool) -> Result<(), Box<dyn Error>> {
    let mut url = format!("{}/reagents", CONFIG.deref().url.clone());
    let client = Client::new();

    if !json {
        url.push_str("?asText=true");
    }

    let response = client.get(url).body(name).send()?;

    println!("{}", response.text()?);

    Ok(())
}
