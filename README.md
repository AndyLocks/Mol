[![Spring](https://img.shields.io/badge/Spring-a6e3a1?style=for-the-badge&logo=spring&labelColor=1e1e2e&logoColor=a6e3a1)](https://spring.io/)
[![neo4j](https://img.shields.io/badge/neo4j-89b4fa?style=for-the-badge&logo=neo4j&logoColor=cdd6f4&labelColor=1e1e2e)](https://neo4j.com/)

[**Documentation is also available in Russian!!!**](ru/README.md)
[**Documentation is also available in German!!!**](de/README.md)

# Molecular Reaction Server

This is an experimental project that connects chemistry with abstract mathematics through category theory. At its core lies an original model in which molecules and chemical reactions are represented as objects and morphisms in a multicategory.

The project offers:

* A formal description of chemical reactions as compositional transformations;
* A custom syntax for describing molecules, reactions, and reaction chains;
* A server-side API for analyzing, storing, and searching reaction pathways;
* A possible foundation for synthesis simulation, automatic product derivation, and reaction network visualization.

Why might this be interesting?

* For mathematicians: a living example of applying categorical thinking to natural science.
* For chemists: a tool for analyzing and formalizing reactions without losing chemical meaning.
* For programmers: a clean, extensible project at the intersection of language, graphs, and algebra.

---

# Mol Language

This is a custom-designed language specifically created for this project. Here's a sample:

```
CH3 + 2O2 -> CO2 + 2H2O ; NaOH + HCl -> NaCl  
NaOH + HCl -> H2O  
  
(2H2O2) -> 2H2O + O2  
  
  
(Zn, HCl) -> ZnCl_2  
H2 + Cl2 -> 2HCl  
2H2 + O2 -> 2H2O  
2Na + Cl2 -> 2NaCl  
CaCO3 -> CaO + CO2

// just random comment lol
```

---

# Reaction Server

This is a server that accepts requests, parses the mol language, and interacts with a neo4j server where the graph of all reactions is stored.

## Running the server

Make sure docker and docker-compose are installed:

```sh
docker compose up
```

## API

* /import — Imports a .mol file and adds the data to the reaction graph. Example:

```sh
curl -X POST http://localhost:8080/import -F "file=@./example.mol"
```

* /products — Returns the products that can be obtained from the given reagents:

```sh
curl -X GET http://localhost:8080/products\?asText\=true -H "Content-Type: application/json" -d '["H2", "Cl2"]'
```

Output:

```
[Cl2, H2] -> HCl
```

* /reagents — Returns the reagents needed to produce a given product:

```sh
curl -X GET http://localhost:8080/reagents\?asText\=true -d 'HCl'
```

Output:

```
[H2S, FeCl3] -> HCl  
[H2, Cl2] -> HCl
```

In all cases, if the asText parameter is true, the output is shown as readable text. If false or omitted, the response is returned as JSON:

```json
[
  {
    "reagents": [
      {
        "name": "H2S"
      },
      {
        "name": "FeCl3"
      }
    ],
    "product": {
      "name": "HCl"
    }
  },
  {
    "reagents": [
      {
        "name": "H2"
      },
      {
        "name": "Cl2"
      }
    ],
    "product": {
      "name": "HCl"
    }
  }
]
```

---

## Graph Visualization

Once the server is running locally, you can view the reaction graph by navigating to http://localhost:7474. This is the default port for neo4j. Example output:

![[./images/graph.png]]

---

## CLI

The CLI is still under development, but already functional. It simplifies usage and allows you to communicate with the server more easily:

```sh
./mol products O2 CO
```

```sh
./mol reagents S
```

```sh
./mol import ./example.mol
```

Located in the mol\_cli directory.
