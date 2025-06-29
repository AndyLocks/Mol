use crate::constants::BASE_URL;
use reqwest::{Client};
use std::error::Error;

pub async fn execute(names: Vec<String>, client: &Client) -> Result<(), Box<dyn Error>> {
    let url = format!("{}/products?asText=true", BASE_URL);

    let response = client
        .get(url)
        .header("Content-Type", "application/json")
        .body(serde_json::to_string(&names)?)
        .send()
        .await?;

    println!("{}", response.text().await?);

    Ok(())
}
