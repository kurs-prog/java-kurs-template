package losungen;

import java.util.Scanner;

public class Freizeitsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingaben
        System.out.print("Alter: ");
        int alter = scanner.nextInt();

        System.out.print("Mitgliedsausweis vorhanden (true/false): ");
        boolean istMitglied = scanner.nextBoolean();

        System.out.print("Geschlecht (m/w/d): ");
        char geschlecht = scanner.next().charAt(0);

        System.out.println("Tageszeit wählen: 1=Vormittag, 2=Nachmittag, 3=Abend, 4=Nacht");
        int tageszeit = scanner.nextInt();

        boolean zutrittErlaubt = false;
        String zugangsNachricht = "";
        String begruessung = "";
        String angebot = "";

        // Zugangslogik
        if (alter < 6) {
            zugangsNachricht = "Zutritt verweigert: zu jung.";
        } else if (alter <= 15) {
            if (istMitglied && (tageszeit == 1 || tageszeit == 2)) {
                zutrittErlaubt = true;
            } else {
                zugangsNachricht = "Zutritt verweigert: nur mit Ausweis und tagsüber erlaubt.";
            }
        } else if (alter <= 64) {
            zutrittErlaubt = true;
            if (tageszeit == 4) {
                zugangsNachricht = "Hinweis: Nachtzugang aktiv.";
            }
        } else { // 65+
            if (tageszeit == 1 || tageszeit == 2 || istMitglied) {
                zutrittErlaubt = true;
            } else {
                zugangsNachricht = "Zutritt verweigert: für Senioren nur tagsüber oder mit Ausweis.";
            }
        }

        // Begrüßung bei Zutritt
        if (zutrittErlaubt) {
            if (geschlecht == 'w') {
                begruessung = "Willkommen, Frau!";
            } else if (geschlecht == 'm') {
                begruessung = "Willkommen, Herr!";
            } else {
                begruessung = "Willkommen!";
            }

            // Menüauswahl
            System.out.println("Bitte wählen Sie ein Angebot:");
            System.out.println("1 – Schwimmbad");
            System.out.println("2 – Fitnessbereich");
            System.out.println("3 – Sauna");
            System.out.println("4 – Kino");

            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    angebot = "Schwimmbad gewählt – Viel Spaß beim Baden!";
                    break;
                case 2:
                    angebot = "Fitnessbereich geöffnet – Viel Spaß beim Training!";
                    break;
                case 3:
                    angebot = "Saunabereich aktiv – Bitte Handtuch mitnehmen.";
                    break;
                case 4:
                    angebot = "Kino läuft – Viel Vergnügen beim Film!";
                    break;
                default:
                    angebot = "Ungültige Auswahl.";
            }
        }

        // Gesamtausgabe am Ende
        System.out.println("\n--- Zusammenfassung ---");
        System.out.println("Alter: " + alter);
        System.out.println("Mitglied: " + (istMitglied ? "Ja" : "Nein"));
        System.out.println("Geschlecht: " + geschlecht);
        System.out.println("Tageszeit-Code: " + tageszeit);

        if (zutrittErlaubt) {
            System.out.println("Zutritt: Erlaubt");
            System.out.println(begruessung);
            System.out.println("Angebot: " + angebot);
            if (!zugangsNachricht.isEmpty()) {
                System.out.println("Hinweis: " + zugangsNachricht);
            }
        } else {
            System.out.println("Zutritt: Verweigert");
            System.out.println("Begründung: " + zugangsNachricht);
        }

        scanner.close();
    }
}
