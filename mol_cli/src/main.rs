mod commands;
mod config;

use clap::{Parser, Subcommand};
use reqwest::blocking::Client;
use std::path::PathBuf;

#[derive(Parser)]
#[command(
    name = "mol",
    version,
    about = "Mol CLI",
    arg_required_else_help = true
)]
pub struct Cli {
    #[command(subcommand)]
    pub(crate) command: Commands,
}

#[derive(Subcommand)]
enum Commands {
    #[command(
        about = "Imports input (file, stdin, direct input) to the server",
        after_help = "Example for stdin:\n\n  echo \"NaOH + HCl -> H2O\" | mol",
        help_expected = true
    )]
    Import {
        #[arg(short, long, help = "File to import")]
        file: Option<PathBuf>,

        #[arg(short, long, help = "String to import")]
        script: Option<String>,
    },

    #[command(
        about = "Shows products that can be obtained from a list of molecules",
        help_expected = true
    )]
    Products {
        #[arg(help = "Products: List of molecules")]
        names: Vec<String>,

        #[arg(short, long, help = "Display as json file")]
        json: bool,
    },

    #[command(
        about = "Shows from which molecules we can obtain the specified",
        help_expected = true
    )]
    Reagents {
        name: String,

        #[arg(short, long, help = "Display as json file")]
        json: bool,
    },

    #[command(
        about = "Show or Update server url",
        help_expected = true
    )]
    Url {
        #[arg(help = "Url to save in config")]
        url: Option<String>,

        #[arg(short, long, help = "Display url")]
        output: bool,
    },
}

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
