use reqwest::{Client};
use std::error::Error;
use std::ops::Deref;
use crate::config::CONFIG;

pub async fn execute(names: Vec<String>, client: &Client) -> Result<(), Box<dyn Error>> {
    let url = format!("{}/products?asText=true", CONFIG.deref().url.clone());

    let response = client
        .get(url)
        .header("Content-Type", "application/json")
        .body(serde_json::to_string(&names)?)
        .send()
        .await?;

    println!("{}", response.text().await?);

    Ok(())
}
