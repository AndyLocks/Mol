# Команда `import`

Команда `import` отправляет Mol код на Mol сервер, после чего сервер обновляет граф молекулярных реакций.

## Импорт файла

Вы можете импортировать файлы с расширением `.mol`, о которых шла речь в графе про [язык Mol](./mol_language.md). Для этого есть опция `-f`:

```bash
mol import -f example.mol
```

## Импорт вручную написанной строки

Вы также можете не создавая файл импортировать [Mol код](./mol_language.md):

```bash
mol import -s 'CH3 + 2O2 -> CO2 + 2H2O ; NaOH + HCl -> NaCl'
```

## Стандартный поток

Вы также можете пользоваться stdin. Это может быть полезно для скриптов:

```bash
echo "CH3 + 2O2 -> CO2 + 2H2O ; NaOH + HCl -> NaCl" | mol import
```

```bash
cat example.mol | mol import
```

---

Вы также можете пользоваться всем сразу:

```bash
cat example.mol | mol import -f example2.mol -s 'CH3 + 2O2 -> CO2 + 2H2O'
```
