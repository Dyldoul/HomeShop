package com.dylan.homeshop;

public class Product {

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    /**
     * Affiche la description du produit
     */
    public void look(){

    }

    /**
     * Ajoute le produit a la facture
     * @param bill La facture concernee
     * @param quantity La quantite a ajouté
     */
    public void buy(Bill bill, Integer quantity) {

    }

}
