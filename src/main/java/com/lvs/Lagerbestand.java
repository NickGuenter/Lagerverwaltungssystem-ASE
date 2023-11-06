package com.lvs;
import java.util.ArrayList;
import java.util.List;

public class Lagerbestand {

    private List<Produkt> produkte;

    public Lagerbestand(List<Produkt> produkte) {
        this.produkte = produkte;
    }

    public Lagerbestand() {
        produkte = new ArrayList<Produkt>();
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void addProdukt(Produkt produkt) {
        produkte.add(produkt);
    }

    public void addProdukte(List<Produkt> produkte) {
        this.produkte.addAll(produkte);
    }

    public void removeProdukt(Produkt produkt) {
        produkte.remove(produkt);
    }

    public void updateProdukt(Produkt produkt) {
        for (Produkt p : produkte) {
            if (p.getProduktId() == produkt.getProduktId()) {
                p.setName(produkt.getName());
                p.setPreis(produkt.getPreis());
                p.setMenge(produkt.getMenge());
            }
        }
    }

    public Produkt getProduktById(int produktId) {
        for (Produkt p : produkte) {
            if (p.getProduktId() == produktId) {
                return p;
            }
        }
        return null;
    }

    public void printProdukte() {
        for (Produkt p : produkte) {
            System.out.println(p.getProduktId() + " " + p.getName() + " " + p.getPreis() + " " + p.getMenge());
        }
    }

    public void printProduktById(int produktId) {
        for (Produkt p : produkte) {
            if (p.getProduktId() == produktId) {
                System.out.println(p.getProduktId() + " " + p.getName() + " " + p.getPreis() + " " + p.getMenge());
            }
        }
    }

    public void printProduktByName(String name) {
        for (Produkt p : produkte) {
            if (p.getName().equals(name)) {
                System.out.println(p.getProduktId() + " " + p.getName() + " " + p.getPreis() + " " + p.getMenge());
            }
        }
    }

    public int gesamtMenge() {
        int gesamtMenge = 0;
        for (Produkt p : produkte) {
            gesamtMenge += p.getMenge();
        }
        return gesamtMenge;
    }
}