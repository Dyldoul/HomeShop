package com.dylan.homeshop.homeshop;

public class Client {

    private String nomComplet;
    private String adresse;


    //Constructeur

    public Client(String nomComplet, String adresse) {
        this.nomComplet = nomComplet;
        this.adresse = adresse;
    }

    //Getters
    public String getNomComplet() {
        return nomComplet;
    }

    public String getAdresse() {
        return adresse;
    }
}
