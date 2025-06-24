[![Spring](https://img.shields.io/badge/Spring-a6e3a1?style=for-the-badge&logo=spring&labelColor=1e1e2e&logoColor=a6e3a1)](https://spring.io/)
[![neo4j](https://img.shields.io/badge/neo4j-89b4fa?style=for-the-badge&logo=neo4j&logoColor=cdd6f4&labelColor=1e1e2e)](https://neo4j.com/)

[**Documentation is also available in Russian!!!**](../ru/README.md)
[**Documentation is also available in English!!!**](../README.md)

---

# Molekularer Reaktionsserver

Dies ist ein experimentelles Projekt, das Chemie und abstrakte Mathematik durch Kategorientheorie miteinander verbindet. Im Kern steht ein originelles Modell, in dem Moleküle und chemische Reaktionen als Objekte und Morphismen in einer Multikategorie dargestellt werden.

Das Projekt bietet:

* Eine formale Beschreibung chemischer Reaktionen als kompositionale Transformationen;
* Eine eigene Syntax zur Beschreibung von Molekülen, Reaktionen und Reaktionsketten;
* Eine serverseitige API zur Analyse, Speicherung und zum Auffinden von Reaktionswegen;
* Eine mögliche Grundlage für Synthesesimulation, automatische Produktableitung und Visualisierung von Reaktionsnetzwerken.

Warum ist das interessant?

* Für Mathematiker: ein lebendiges Beispiel für kategorientheoretisches Denken in den Naturwissenschaften.
* Für Chemiker: ein Werkzeug zur Analyse und Formalisierung von Reaktionen, ohne deren Bedeutung zu verlieren.
* Für Programmierer: ein sauber aufgebautes und erweiterbares Projekt an der Schnittstelle zwischen Sprache, Graphen und Algebra.

---

# Mol-Sprache

Dies ist eine speziell für dieses Projekt entwickelte Sprache. Ein Beispiel:

```
CH3 + 2O2 -> CO2 + 2H2O ; NaOH + HCl -> NaCl  
NaOH + HCl -> H2O  
  
(2H2O2) -> 2H2O + O2  
  
  
(Zn, HCl) -> ZnCl_2  
H2 + Cl2 -> 2HCl  
2H2 + O2 -> 2H2O  
2Na + Cl2 -> 2NaCl  
CaCO3 -> CaO + CO2

// nur ein zufälliger Kommentar :)
```

---

# Reaktionsserver

Ein Server, der Anfragen entgegennimmt, die Sprache mol verarbeitet und mit einem Neo4j-Server kommuniziert, auf dem der Reaktionsgraph gespeichert ist.

## Starten

Installiere vorher docker und docker-compose:

```sh
docker compose up
```

## API

* /import — Importiert eine .mol-Datei und fügt die Reaktionen dem Graphen hinzu:

```sh
curl -X POST http://localhost:8080/import -F "file=@./example.mol"
```

* /products — Gibt die Produkte zurück, die aus den angegebenen Reaktanten erzeugt werden können:

```sh
curl -X GET http://localhost:8080/products\?asText\=true -H "Content-Type: application/json" -d '["H2", "Cl2"]'
```

Ausgabe:

```
[Cl2, H2] -> HCl
```

* /reagents — Gibt die Reaktanten zurück, die nötig sind, um ein bestimmtes Produkt herzustellen:

```sh
curl -X GET http://localhost:8080/reagents\?asText\=true -d 'HCl'
```

Ausgabe:

```
[H2S, FeCl3] -> HCl  
[H2, Cl2] -> HCl
```

In allen Fällen zeigt der Parameter asText bei true die Antwort als Text an. Ist er false oder nicht gesetzt, wird das Ergebnis als JSON zurückgegeben:

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

## Graph-Visualisierung

Nach dem Start des Servers kannst du den Reaktionsgraphen lokal im Browser unter http://localhost:7474 ansehen. Dieser Port gehört zur Standardoberfläche von neo4j. Ein Beispiel für die Visualisierung:

![[../images/graph.png]]

---

## CLI

Das CLI befindet sich noch in der Entwicklung, ist aber bereits einsatzbereit. Es vereinfacht die Nutzung und ermöglicht bequemere Kommunikation mit dem Server:

```sh
./mol products O2 CO
```

```sh
./mol reagents S
```

```sh
./mol import ./example.mol
```

Das CLI befindet sich im Verzeichnis mol\_cli.
