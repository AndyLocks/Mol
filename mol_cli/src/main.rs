mod cli;
mod cli_commands;
mod commands;
mod config;
mod executable;

use crate::cli::Cli;
use crate::executable::Executable;
use clap::Parser;

fn main() -> Result<(), Box<dyn std::error::Error>> {
    Cli::parse().command.execute()
}
