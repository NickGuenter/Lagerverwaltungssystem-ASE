package com.lvs;
import java.util.ArrayList;
import java.util.Scanner;

public class Konsolenausgabe {
    public static void main(String[] args) throws InterruptedException {

        Lagerverwaltungssystem lagerverwaltungssystem = new Lagerverwaltungssystem();
        System.out.println("Welcome back!");
        boolean running = true;

        while (running) {

            // Hauptmenu anzeigen und Auswahl einlesen
            System.out.println("Hauptmenu");
            System.out.println("1. Bestellung erstellen");
            System.out.println("2. Bestellungshistorie anzeigen");
            System.out.println("3. Lieferanten anzeigen");
            System.out.println("4. Kunden anzeigen");
            System.out.println("5. Beenden");

            Scanner scanner = new Scanner(System.in);
            try {
                int input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            boolean running2 = true;
                            ArrayList<Produkt> produkte = new ArrayList<Produkt>();
                            int bestellungsId = 0;

                            while (running2) {
                                System.out.println("Bestellung erstellen");
                                System.out.println("1. Produkt hinzufügen");
                                System.out.println("2. Bestellung abschließen");
                                System.out.println("3. Zurück");

                                Scanner scanner2 = new Scanner(System.in);

                                try {
                                    int input2 = scanner2.nextInt();
                                    switch (input2) {
                                        case 1:
                                            System.out.println("Bestellungs ID angeben:");
                                            bestellungsId = scanner2.nextInt();
                                            System.out.println("Produkt ID angeben:");
                                            int produktId = scanner2.nextInt();
                                            System.out.println("Produkt Name angeben:");
                                            String name = scanner2.next();
                                            System.out.println("Produkt Preis angeben:");
                                            double preis = scanner2.nextDouble();
                                            System.out.println("Produkt Menge angeben:");
                                            int menge = scanner2.nextInt();
                                            produkte.add(new Produkt(produktId, name, preis, menge));
                                            break;
                                        case 2:
                                            if(produkte.size() != 0) {
                                                lagerverwaltungssystem.addBestellung(bestellungsId, produkte);
                                            }
                                            running2 = false;
                                            break;
                                        case 3:
                                            running2 = false;
                                            break;
                                        default:
                                            throw new Exception();
                                    }
                                } catch (Exception e) {
                                    System.out.println("Ungültige Eingabe");
                                    Thread.sleep(1000);
                                }
                            }
                            break;
                        case 2:
                            lagerverwaltungssystem.printBestellungen();
                            break;
                        case 3:
                            System.out.println("Lieferanten anzeigen");
                            break;
                        case 4:
                            System.out.println("Kunden anzeigen");
                            break;
                        case 5:
                            running = false;
                            break;
                        default:
                            throw new Exception();
                    }
            } catch (Exception e) {
                System.out.println("Ungültige Eingabe");
                Thread.sleep(1000);
            }
        }
    }
}
