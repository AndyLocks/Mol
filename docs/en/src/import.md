# The `import` Command

The `import` command sends Mol code to the Mol server, after which the server updates the graph of molecular reactions.

## Importing a File

You can import files with the `.mol` extension, as described in the section on the [Mol language](./mol_language.md). To do this, use the `-f` option:

```bash
mol import -f example.mol
```

## Importing a Manually Written String

You can also import [Mol code](./mol_language.md) without creating a file:

```bash
mol import -s 'CH3 + 2O2 -> CO2 + 2H2O ; NaOH + HCl -> NaCl'
```

## Standard Input

You can also use stdin, which can be useful for scripts:

```bash
echo "CH3 + 2O2 -> CO2 + 2H2O ; NaOH + HCl -> NaCl" | mol import
```

```bash
cat example.mol | mol import
```

---

You can also combine all methods:

```bash
cat example.mol | mol import -f example2.mol -s 'CH3 + 2O2 -> CO2 + 2H2O'
```

