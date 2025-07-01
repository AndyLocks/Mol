use reqwest::blocking::Client;
use std::error::Error;
use std::ops::Deref;
use crate::config::CONFIG;

pub fn execute(name: String, json: bool, client: &Client) -> Result<(), Box<dyn Error>> {
    let mut url = format!("{}/reagents", CONFIG.deref().url.clone());

    if !json {
        url.push_str("?asText=true");
    }

    let response = client.get(url).body(name).send()?;

    println!("{}", response.text()?);

    Ok(())
}
