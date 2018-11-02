package com.dylan.homeshop;

public class Frigo extends Product {
    private int capaciteLitre;
    private boolean bacFreezer;


    public Frigo(String name, String description, double price, int capaciteLitre, boolean bacFreezer) {
        super(name, description, price);
        this.bacFreezer = bacFreezer;
        this.capaciteLitre = capaciteLitre;
    }

    public int getCapaciteLitre() {
        return capaciteLitre;
    }

    public boolean isBacFreezer() {
        return bacFreezer;
    }
}
