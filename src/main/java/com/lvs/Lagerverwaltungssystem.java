package com.lvs;

import java.util.ArrayList;

public class Lagerverwaltungssystem {

    private Lagerbestand lagerbestand;
    private ArrayList<Bestellung> bestellungen;

    public Lagerverwaltungssystem() {
        lagerbestand = new Lagerbestand();
        bestellungen = new ArrayList<Bestellung>();
    }

    public void addBestellung(int bestellungsId, ArrayList<Produkt> produkte) {
        Bestellung bestellung = new Bestellung(bestellungsId, produkte);
        bestellungen.add(bestellung);
        lagerbestand.addProdukte(produkte);
    }

    public void printBestellungen() {
        System.out.println();
        System.out.println("Bestellungen:");
        System.out.println("-----------------------------------------------------");
        for (Bestellung b : bestellungen) {
            b.printProdukte();
            System.out.println("Gesamtmenge: " + b.gesamtMenge());
            System.out.println("-----------------------------------------------------");
        }
    }
}
