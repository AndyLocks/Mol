# Syntax

## Writing Molecules

Mol is a case-sensitive language. This means that how you write the names of molecules is very important. The Mol server (which processes Mol code) splits each molecule into atoms and checks whether those atoms are valid (i.e., whether they exist at all). The lexer treats any sequence that starts with an uppercase letter followed by optional lowercase letters as an atom.

Let’s look at the notation `2FeCl3`:

- `2`: the initial number is completely ignored.
- `Fe`: this will be recognized as an atom, because it starts with an uppercase letter followed by lowercase letters. If you wrote `FE` instead, it would be interpreted as two atoms: `F` and `E`. But at some point, the server would return an error saying that the atom `E` does not exist.
- `Cl`: this will also be interpreted as an atom.
- `3`: indicates that there are three `Cl` atoms in the molecule. This value is taken into account.

## Writing Reactions

The syntax of the language is very simple. All reactions can be written in the following format:

```
List of reactants -> List of products
```

You can list molecules using either `+` or `,`: `NaOH + HCl` or `NaOH, HCl`. You can also use parentheses for clarity: `(NaOH + HCl)` or `(NaOH, HCl)`. Here’s what a complete reaction might look like:

```mol
NaOH + HCl -> H2O
```

You can also use `;` to write multiple reactions in a single line:

```mol
NaOH + HCl -> H2O ; CuO + H2 -> Cu + H2O
```

For convenience, you can use the `_` character, which is completely ignored by the language. Here are a few examples: `H_2O`, `H_2_O`, `K_2SO_4`.

## Comments

The language supports both block and line comments:

```mol
// comment

/*
comment
*/
```
