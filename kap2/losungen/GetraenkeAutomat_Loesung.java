package losungen;

import java.util.Scanner;

public class GetraenkeAutomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int auswahl;
        double gesamtpreis = 0.0;
        boolean aktiv = true;

        System.out.println("Willkommen am Getränkeautomaten!");
        System.out.println("Geben Sie eine Slotnummer von 1 bis 9 ein (0 zum Beenden).");

        while (aktiv) {
            System.out.println("\n--- Getraenkewahl ---");
            System.out.println("1-2: Wasser (1.00 €)");
            System.out.println("3: Cola (1.50 €)");
            System.out.println("4: Eistee (1.50 €)");
            System.out.println("5: Apfelschorle (1.30 €)");
            System.out.println("6: Kaffee (2.00 €)");
            System.out.println("7: Orangensaft (1.60 €)");
            System.out.println("8: Kakao (1.70 €)");
            System.out.println("9: Mate (1.80 €)");
            System.out.print("Ihre Wahl: ");

            auswahl = scanner.nextInt();

            switch (auswahl) {
                case 0:
                    aktiv = false;
                    break;
                case 1:
                case 2:
                    System.out.println("Getränk: Wasser | Preis: 1.00 €");
                    gesamtpreis += 1.00;
                    break;
                case 3:
                    System.out.println("Getränk: Cola | Preis: 1.50 €");
                    gesamtpreis += 1.50;
                    break;
                case 4:
                    System.out.println("Getränk: Eistee | Preis: 1.50 €");
                    gesamtpreis += 1.50;
                    break;
                case 5:
                    System.out.println("Getränk: Apfelschorle | Preis: 1.30 €");
                    gesamtpreis += 1.30;
                    break;
                case 6:
                    System.out.println("Getränk: Kaffee | Preis: 2.00 €");
                    gesamtpreis += 2.00;
                    break;
                case 7:
                    System.out.println("Getränk: Orangensaft | Preis: 1.60 €");
                    gesamtpreis += 1.60;
                    break;
                case 8:
                    System.out.println("Getränk: Kakao | Preis: 1.70 €");
                    gesamtpreis += 1.70;
                    break;
                case 9:
                    System.out.println("Getränk: Mate | Preis: 1.80 €");
                    gesamtpreis += 1.80;
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie einen Slot von 1 bis 9.");
            }
        }

        System.out.printf("\nVielen Dank! Gesamtbetrag: %.2f €\n", gesamtpreis);
        scanner.close();
    }
}
