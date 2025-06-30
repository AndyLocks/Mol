mod commands;
mod config;

use std::path::PathBuf;
use clap::{Parser, Subcommand};
use reqwest::Client;

#[derive(Parser)]
#[command(name = "mol", version, about = "Mol CLI")]
struct Cli {
    #[command(subcommand)]
    pub(crate) command: Commands,
}

#[derive(Subcommand)]
enum Commands {
    Import {
        file: PathBuf,
    },

    Products {
        names: Vec<String>,
    },

    Reagents {
        name: String,
    },
}

#[tokio::main]
async fn main() -> Result<(), Box<dyn std::error::Error>> {
    let cli = Cli::parse();
    let client = Client::new();

    match cli.command {
        Commands::Import { file } => {
            commands::import::execute(file, &client).await
        }

        Commands::Products { names } => {
            commands::products::execute(names, &client).await
        }

        Commands::Reagents { name } => {
            commands::reagents::execute(name, &client).await
        }
    }
}
