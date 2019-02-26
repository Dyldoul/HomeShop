package com.dylan.homeshop.homeshop;

public class Television extends Produit{

    private int taille;
    private String technologie;

    public Television(String nom, String description, double prix, int taille, String technologie) {
        super(nom, description, prix);
        this.taille = taille;
        this.technologie = technologie;
    }

    public int getTaille() {
        return taille;
    }

    public String getTechnologie() {
        return technologie;
    }
}
