use clap_complete::{Shell, generate};
use serde::de::StdError;
use std::io;
use clap::CommandFactory;
use crate::cli::Cli;

pub fn execute(shell: Shell) -> Result<(), Box<dyn StdError>> {
    generate(shell, &mut Cli::command(), "mol", &mut io::stdout());

    Ok(())
}
