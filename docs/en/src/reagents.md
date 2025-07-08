# The `reagents` Command

The `reagents` command displays a list of reactants required to produce the specified molecule passed as an argument. It’s essentially like saying, “give me the reactions that can produce this molecule.”

In this overview, I’ll be using the [example Mol document from earlier sections](./mol_example.md). Your output may differ if you [import](./import.md) more data.

Example for water:

```bash
mol reagents H2O
```

Output:

```
[H2SO4, KI, H2O2] -> H2O
[KMnO4, H, H2C2O4] -> H2O
[H2CO3, CaOH2] -> H2O
[CH3COOH, NaOH] -> H2O
[H2SO4, KOH] -> H2O
[CO2, CaOH2] -> H2O
[CuO, H2] -> H2O
[H2, O2] -> H2O
[H2O2] -> H2O
[NaOH, HCl] -> H2O
[O2, CH3] -> H2O
```

Example for `CO2`:

```
[KMnO4, H2C2O4, H] -> CO2
[O2, CO] -> CO2
[C, O2] -> CO2
[CaCO3] -> CO2
[O2, CH3] -> CO2
```
