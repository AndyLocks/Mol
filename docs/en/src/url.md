# The `url` Command

The `url` command manages the `url` value in the configuration file located at `~/.config/mol.toml`. You can also modify this value manually. The configuration file is created on first launch and contains `http://localhost:8080` as the default value, since it's assumed that you'll be running the server manually.

```toml
url = "http://localhost:8080"
```

To check the currently used URL, use the `-o` flag:

```bash
mol url -o
```

This will simply output the URL: `http://localhost:8080`.

To set a new value, run the command without any flags and pass the new address:

```bash
mol url 'http://localhost:8081'
```

---

You can also run `mol url --help` for a quick usage summary.
