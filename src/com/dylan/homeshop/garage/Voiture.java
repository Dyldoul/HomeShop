package com.dylan.homeshop.garage;

import java.util.ArrayList;
import java.util.List;

public class Voiture extends Vehicule {

    private int portes;
    private int littrePar100km;
    private String moteur;
    private List<String> options = new ArrayList<String>();

    public Voiture(String description, String constructeur, int vitesse, int année, String nomModèle, String couleur, int poid, int[] dimensions, int portes, int littrePar100km, String moteur, List<String> options) {
        super(description, constructeur, vitesse, année, nomModèle, couleur, poid, dimensions);
        this.portes = portes;
        this.littrePar100km = littrePar100km;
        this.moteur = moteur;
        this.options = options;
    }

    public void allumeFeuRoute(){
        System.out.println("J'allume mes phares");
    }

    public void ouvreCoffre(){
        System.out.println("J'ouvre le coffre");
    }

    public int getPortes() {
        return portes;
    }

    public int getLittrePar100km() {
        return littrePar100km;
    }

    public String getMoteur() {
        return moteur;
    }

    public List<String> getOptions() {
        return options;
    }
}
