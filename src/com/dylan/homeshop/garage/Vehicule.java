package com.dylan.homeshop.garage;

public class Vehicule {

    private String description;
    private String constructeur;
    private int vitesse;
    private int année;
    private String nomModèle;
    private String couleur;
    private int poid;
    private int[] dimensions = new int[3];

    public Vehicule(String description, String constructeur, int vitesse, int année, String nomModèle, String couleur, int poid, int[] dimensions) {
        this.description = description;
        this.constructeur = constructeur;
        this.vitesse = vitesse;
        this.année = année;
        this.nomModèle = nomModèle;
        this.couleur = couleur;
        this.poid = poid;
        this.dimensions = dimensions;
    }

    public void start(){
        System.out.println("Je suis "+nomModèle+" et je démarre");
    }

    public void stop(){
        System.out.println("Je suis "+nomModèle+" et je m'arrête");
    }

    public String getDescription() {
        return description;
    }

    public String getConstructeur() {
        return constructeur;
    }

    public int getVitesse() {
        return vitesse;
    }

    public int getAnnée() {
        return année;
    }

    public String getNomModèle() {
        return nomModèle;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getPoid() {
        return poid;
    }

    public int[] getDimensions() {
        return dimensions;
    }
}
