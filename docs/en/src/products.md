# The `products` Command

The `products` command displays a list of reactions that are possible using the molecules passed as arguments. Essentially, it means: "show the products I can obtain using these molecules together, assuming I might need one additional component."

In this overview, I’ll be using the [example Mol document from earlier sections](./mol_example.md). Your output may differ if you [import](./import.md) more data.

Here’s an example for water:

```bash
mol products H2O
```

Output:

```
[NH3, H2O] -> OH
[H2O, NH3] -> NH4
[H2O, Na] -> H2
[H2O, Na] -> NaOH
[H2O, K] -> H2
[H2O, K] -> KOH
```

Here’s another example for sodium:

```
mol products Na
```

Output:

```
[H2O, Na] -> H2
[H2O, Na] -> NaOH
[Cl2, Na] -> NaCl
```

Some of these reactions also involve water. Let’s try querying the products that can be made from both water and sodium:

```
mol products Na H2O
```

Output:

```
[H2O, Na] -> H2
[H2O, Na] -> NaOH
```

As you can see, the `products` command only returns reactions that involve **all** of the molecules passed as arguments (in this case, `H2O` and `Na`). If there were a reaction involving three reactants like `H2O + Na + x -> ...`, it would also be listed.
