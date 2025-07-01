use reqwest::blocking::Client;
use std::error::Error;
use std::ops::Deref;
use crate::config::CONFIG;

pub fn execute(names: Vec<String>, json: bool, client: &Client) -> Result<(), Box<dyn Error>> {
    let mut url = format!("{}/products", CONFIG.deref().url.clone());

    if !json {
        url.push_str("?asText=true")
    }

    let response = client
        .get(url)
        .header("Content-Type", "application/json")
        .body(serde_json::to_string(&names)?)
        .send()?;

    println!("{}", response.text()?);

    Ok(())
}
