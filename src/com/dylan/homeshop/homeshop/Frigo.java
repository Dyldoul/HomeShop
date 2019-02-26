package com.dylan.homeshop.homeshop;

public class Frigo extends Produit{

    private int littre;
    private boolean congelateur;

    public Frigo(String nom, String description, double prix, int littre, boolean congelateur) {
        super(nom, description, prix);
        this.littre = littre;
        this.congelateur = congelateur;
    }

    public int getLittre() {
        return littre;
    }

    public boolean isCongelateur() {
        return congelateur;
    }
}
