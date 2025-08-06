# 💻 Programmieraufgabe: Der interaktive Ausweis-Generator

## 📝 Aufgabenstellung

Schreibe ein Java-Programm, das per **Konsoleneingabe** persönliche Daten vom Benutzer abfragt und daraus einen **formatierten Ausweis** erstellt.

---

## 🎯 Anforderungen im Detail

1. **Frage folgende Informationen per Konsole ab** und speichere sie in passenden Variablen:
    - Vorname 
    - Nachname 
    - Alter 
    - Geschlecht (`m`, `w`, `d`)
    - Ist Student?
    - Körpergröße in Metern
    - Eine frei gewählte Ausweisnummer (`int`), aus der du später die letzte Ziffer berechnest

2. **Berechne:**
    - Das **Geburtsjahr**
    - Ob die Person einen **Rabatt erhält** (wenn es um einen `Studenten` handelt oder `alter<18`)
    - ob die Ausweisnummer gerade oder ungerade ist mit dem Operator `%`

3. **Formatiere die Ausgabe**, sodass ein übersichtlicher Ausweis am Bildschirm erscheint.

---

## 📌 Beispielhafte Konsolenausgabe

```
----- PERSONENAUSWEIS -----
Name: Max Beispiel
Alter: 22 Jahre
Geburtsjahr: 2003
Geschlecht: m
Student: Nein
Körpergröße: 1.80 m
Ausweis-Endziffer: 4
Rabatt erhalten: Nein
---------------------------
```

---

## ✏️ Hinweise

- Verwende `Scanner` für Benutzereingaben.
- Achte auf sinnvolle Datentypen (z.B. `char` für Geschlecht, `boolean` für Student).
- Nutze **if-Statements**, um die Rabattregel umzusetzen.
- Denke an saubere Formatierung der Ausgabe (`println`, `+`, Einrückung etc.).

---

## 💡 Optional für kreative Schüler:innen

- Gib bei Geschlecht `w` ein „♀“, bei `m` ein „♂“ und bei `d` ein „⚧“ aus. (Tipp: google nach ASCII-Tabelle)
- Runde die Körpergröße auf eine Nachkommastelle.
- Baue eine Begrüßung oder eine Mini-Fehlermeldung bei unrealistischen Werten ein.
