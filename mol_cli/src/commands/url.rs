use crate::config::{CONFIG, Config};
use clap::Error;
use clap::error::ErrorKind;
use std::error::Error as StdError;

pub fn execute(url: Option<String>, output: bool) -> Result<(), Box<dyn StdError>> {
    if output {
        println!("{}", CONFIG.url);

        return Ok(());
    }

    if url.is_none() {
        Error::raw(
            ErrorKind::MissingRequiredArgument,
            "Url is required without -o flag",
        )
        .exit();
    }

    let mut cfg: Config = confy::load("mol", "mol").expect("Cannot load config");

    cfg.url = url.expect("Url cannot be null");

    confy::store("mol", "mol", &cfg).expect("Cannot store config");

    Ok(())
}
