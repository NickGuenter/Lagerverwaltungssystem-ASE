package com.lvs;

public class Produkt {
    
    private int produktId;
    private String name;
    private double preis;
    private int menge;

    public Produkt(int produktId, String name, double preis, int menge) {
        this.produktId = produktId;
        this.name = name;
        this.preis = preis;
        this.menge = menge;
    }
    
    public int getProduktId() {
        return produktId;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

        public int getMenge() {
        return menge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
