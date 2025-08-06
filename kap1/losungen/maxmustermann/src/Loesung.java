package src;

import java.net.SocketOption;

public class Loesung {
    public static void main(String[] args) {

        int alter = 25;
        double wert = 72.5;
        System.out.println("der Wert ist: " + wert);

        System.out.println("__________");

        int ersteErgebnis = 7 / 2;
        System.out.println(ersteErgebnis);
        double zweiteErgebnis = 7.0 / 2;
        System.out.println(zweiteErgebnis);

        System.out.println("__________");

        int modZahl = 7 % 2;
        if (modZahl == 0) {
            System.out.println("Der zahl ist gerade");
        } else
            System.out.println("Der zahl ist ungerade");

        System.out.println("__________");

        int ersteZahl = 5;
        int zweiteZahl = 6;
        boolean ergebnis = ersteZahl == zweiteZahl;
        System.out.println(ergebnis);

        System.out.println("__________");

        int ersteWert = 0;
        int zweiteWert = 1;

        if (ersteWert < 3 && zweiteWert < 3) {
            System.out.println("true");
        } else{
            System.out.println("falsch");}
        // Herr Cetin sorry da hier bei zweiteWert ist was Schief :(
        if (ersteWert <= 0 || zweiteWert == 3) {
            System.out.println("true");
        } else {
            System.out.println("falsch");}

        if (ersteWert != 3){
            System.out.println("true");
        }
        else{
            System.out.println("falsch");}


        System.out.println("__________");


       double a = 5.2;
       int b = (int) a;
       System.out.println(b);

       System.out.println("__________");

       String vorName = "Tala";
       String nachName = "Shihada";
       String vollName = vorName +" "+ nachName;
       System.out.println(vollName);
    }
}