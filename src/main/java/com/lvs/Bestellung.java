package com.lvs;
import java.util.ArrayList;
import java.util.List;

public class Bestellung {

    private int bestellungsId;
    private List<Produkt> produkte;

    public Bestellung(int bestellungsId, List<Produkt> produkte) {
        this.bestellungsId = bestellungsId;
        this.produkte = produkte;
    }

        public Bestellung() {
        this.bestellungsId = (int) (Math.random() * 1000);
        this.produkte = new ArrayList<Produkt>();
    }

    // Getter & Setter
    public int gesamtMenge() {
        int gesamtMenge = 0;
        for (Produkt produkt : produkte) {
            gesamtMenge += produkt.getMenge();
        }
        return gesamtMenge;
    }

    public int getBestellungsId() {
        return bestellungsId;
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }

    public void addProdukt(Produkt produkt) {
        produkte.add(produkt);
    }

    public void printProdukte() {
        for (Produkt p : produkte) {
            System.out.println("Produkt ID: " + p.getProduktId() + ", Name: " + p.getName() + ", Preis: " + p.getPreis() + ", Menge: " + p.getMenge());
        }
    }
}