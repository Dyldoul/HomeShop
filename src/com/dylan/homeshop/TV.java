package com.dylan.homeshop;

public class TV extends Product{
    private int taille;
    private String technoDalle;


    public TV(String name, String description, double price, int taille, String technoDalle) {
        super(name, description, price);
        this.taille = taille;
        this.technoDalle = technoDalle;
    }

    public int getTaille() {
        return taille;
    }

    public String getTechnoDalle() {
        return technoDalle;
    }
}
