use clap::Subcommand;
use clap_complete::Shell;
use std::path::PathBuf;

#[derive(Subcommand)]
pub enum Commands {
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

    #[command(about = "Show or Update server url", help_expected = true)]
    Url {
        #[arg(help = "Url to save in config")]
        url: Option<String>,

        #[arg(short, long, help = "Display url")]
        output: bool,
    },

    #[command(about = "Generate auto completion", help_expected = true)]
    Completions {
        #[arg(help = "Your shell name (zsh, bash, fish, elvish, powershell)")]
        shell: Shell,
    },
}
