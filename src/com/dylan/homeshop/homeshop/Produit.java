package com.dylan.homeshop.homeshop;

public class Produit {

    // Attributs
    private String nom;
    private String description;
    private double prix;


    //Constructeurs
    public Produit() {
    }

    public Produit(String nom, String description, double prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    //Getters et Setters
    public String getNom() {
        return nom;
    }


    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    //Methodes

    /**
     * Affiche la description du produit
     */
    public void look(){
        System.out.println("Je suis un "+getNom()+" je coute :"+getPrix()+"€");
        System.out.println("Voici ma desciption : "+getDescription());
    }

    /**
     * Ajoute le produit a la facture
     * @param facture la facture concernée
     * @param quantity la quantité a ajouté
     */
    public void achat(Facture facture, Integer quantity){

    }
}
