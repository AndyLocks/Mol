use once_cell::sync::Lazy;
use serde::{Deserialize, Serialize};

#[derive(Debug, Serialize, Deserialize)]
pub struct Config {
    pub url: String,
}

impl Default for Config {
    fn default() -> Self {
        Self {
            url: "http://localhost:8080".into(),
        }
    }
}

pub static CONFIG: Lazy<Config> =
    Lazy::new(|| confy::load("mol", "mol").expect("Cannot load config"));
