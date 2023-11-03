package com.lvs;
import java.util.List;

public class Bestellung {

    private int bestellungsId;
    private List<Produkt> produkte;

    public Bestellung(int bestellungsId, List<Produkt> produkte) {
        this.bestellungsId = bestellungsId;
        this.produkte = produkte;
    }

    public int gesamtMenge() {
        int gesamtMenge = 0;
        for (Produkt produkt : produkte) {
            gesamtMenge += produkt.getMenge();
        }
        return gesamtMenge;
    }

    // Getter & Setter
    public int getBestellungsId() {
        return bestellungsId;
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }
}