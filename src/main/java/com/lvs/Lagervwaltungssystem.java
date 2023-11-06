package com.lvs;

import java.util.ArrayList;

public class Lagervwaltungssystem {

    private static Lagerbestand lagerbestand;
    private static ArrayList<Bestellung> bestellungen;

    public Lagervwaltungssystem() {
        
    }

    public static void main( String[] args )
    {
        lagerbestand = new Lagerbestand(new ArrayList<Produkt>());
        bestellungen = new ArrayList<Bestellung>();

        ArrayList<Produkt> produkte = new ArrayList<Produkt>();
        produkte.add(new Produkt(0, "test", 100, 10));
        produkte.add(new Produkt(1, "test 2", 150, 35));
        addBestellung(0, produkte);

        lagerbestand.printProdukte();
        System.out.println("Gesamtmenge: " + lagerbestand.gesamtMenge());
    }

    public static void addBestellung(int id, ArrayList<Produkt> produkte) {
        bestellungen.add(new Bestellung(id, produkte));
        lagerbestand.addProdukte(produkte);
    }
}
