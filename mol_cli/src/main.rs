mod cli;
mod cli_commands;
mod commands;
mod config;

use crate::cli::Cli;
use crate::cli_commands::Commands;
use clap::Parser;
use reqwest::blocking::Client;

fn main() -> Result<(), Box<dyn std::error::Error>> {
    let cli = Cli::parse();
    let client = Client::new();

    match cli.command {
        Commands::Import { file, script } => commands::import::execute(file, script, &client),
        Commands::Products { names, json } => commands::products::execute(names, json, &client),
        Commands::Reagents { name, json } => commands::reagents::execute(name, json, &client),
        Commands::Url { url, output } => commands::url::execute(url, output),
    }
}
