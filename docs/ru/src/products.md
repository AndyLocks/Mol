# Команда `products`

Команда `products` выводит список реакций, которые возможны с переданными в качестве аргумента молекулами. По сути она означает "выведи продукты, которые я могу получить используя эти молекулы в совокупности, допуская то, что мне может понадобиться еще какой-то элемент".

В этом обзоре я буду использовать [пример документа `mol` из предыдущих глав](./mol_example.md). У вас может быть другой вывод, если вы [импортируете](./import.md) больше данных.

Вот пример для воды:

```bash
mol products H2O
```

Вывод:

```
[NH3, H2O] -> OH
[H2O, NH3] -> NH4
[H2O, Na] -> H2
[H2O, Na] -> NaOH
[H2O, K] -> H2
[H2O, K] -> KOH
```

Вот еще один пример для натрия:

```
mol products Na
```

Вывод:

```
[H2O, Na] -> H2
[H2O, Na] -> NaOH
[Cl2, Na] -> NaCl
```

В некоторых из этих реакций участвует также и вода. Давайте попробуем запросить продукты, которые можно получить из воды и натрия одновременно:

```
mol products Na H2O
```

```
[H2O, Na] -> H2
[H2O, Na] -> NaOH
```

Как видите, команда `products` вывела только те реакции, в которых одновременно участвуют все молекулы переданные в качестве аргументов (в данном случае `H2O` и `Na`). Если бы существовала реакция с тремя реагентами вида `H2O + Na + x -> ...`, то она также вывелась бы.
