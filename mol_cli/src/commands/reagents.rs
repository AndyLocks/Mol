use reqwest::Client;
use std::error::Error;
use std::ops::Deref;
use crate::config::CONFIG;

pub async fn execute(name: String, client: &Client) -> Result<(), Box<dyn Error>> {
    let url = format!("{}/reagents?asText=true", CONFIG.deref().url.clone());

    let response = client.get(url).body(name).send().await?;

    println!("{}", response.text().await?);

    Ok(())
}
