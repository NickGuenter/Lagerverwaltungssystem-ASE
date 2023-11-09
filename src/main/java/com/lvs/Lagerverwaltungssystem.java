package com.lvs;

import java.util.ArrayList;

public class Lagerverwaltungssystem {

    private static Lagerbestand lagerbestand;
    private static ArrayList<Bestellung> bestellungen;

    public Lagerverwaltungssystem() {
        
    }

    public static void main( String[] args )
    {
        lagerbestand = new Lagerbestand(new ArrayList<Produkt>());
        bestellungen = new ArrayList<Bestellung>();

        ArrayList<Produkt> produkte = new ArrayList<Produkt>();
        produkte.add(new Produkt(0, "test 1", 100, 10));
        produkte.add(new Produkt(1, "test 2", 150, 35));
        addBestellung(0, produkte);

        Bestellung bestellung = new Bestellung();
        bestellung.addProdukt(new Produkt(2, "test 3", 200, 20));
        bestellung.addProdukt(new Produkt(3, "test 4", 250, 25));
        bestellungen.add(bestellung);
        
        // Print bestellungen
        System.out.println();
        System.out.println("Bestellungen:");
        System.out.println("-----------------------------------------------------");
        for (Bestellung b : bestellungen) {
            b.printProdukte();
            System.out.println("Gesamtmenge: " + b.gesamtMenge());
            System.out.println("-----------------------------------------------------");
        }
    }

    public static void addBestellung(int id, ArrayList<Produkt> produkte) {
        bestellungen.add(new Bestellung(id, produkte));
        lagerbestand.addProdukte(produkte);
    }
}
