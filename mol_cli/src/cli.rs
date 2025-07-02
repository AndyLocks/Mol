use crate::cli_commands::Commands;
use clap::Parser;

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
