use crate::constants::BASE_URL;
use reqwest::Client;
use std::error::Error;

pub async fn execute(name: String, client: &Client) -> Result<(), Box<dyn Error>> {
    let url = format!("{}/reagents?asText=true", BASE_URL);

    let response = client.get(url).body(name).send().await?;

    println!("{}", response.text().await?);

    Ok(())
}
