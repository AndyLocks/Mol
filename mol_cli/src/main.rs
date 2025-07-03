mod cli;
mod cli_commands;
mod commands;
mod config;
mod executable;

use crate::cli::Cli;
use crate::cli_commands::Commands;
use clap::Parser;

fn main() -> Result<(), Box<dyn std::error::Error>> {
    let cli = Cli::parse();

    match cli.command {
        Commands::Import { file, script } => commands::import::execute(file, script),
        Commands::Products { names, json } => commands::products::execute(names, json),
        Commands::Reagents { name, json } => commands::reagents::execute(name, json),
        Commands::Url { url, output } => commands::url::execute(url, output),
    }
}
