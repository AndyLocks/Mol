use serde::de::StdError;
use crate::cli_commands::Commands;
use crate::commands;

pub trait Executable {
    fn execute(self) -> Result<(), Box<dyn StdError>>;
}

impl Executable for Commands {
    fn execute(self) -> Result<(), Box<dyn StdError>> {
        match self {
            Commands::Import { file, script } => commands::import::execute(file, script),
            Commands::Products { names, json } => commands::products::execute(names, json),
            Commands::Reagents { name, json } => commands::reagents::execute(name, json),
            Commands::Url { url, output } => commands::url::execute(url, output),
        }
    }
}