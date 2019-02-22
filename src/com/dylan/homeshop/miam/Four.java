package com.dylan.homeshop.miam;

public class Four {

    int puissance;
    int capacite;

    public void cuire(Alliments aliment){
        System.out.println("Je cuis un alliment : "+aliment.nom);
        System.out.println("Avec ma puissance de "+puissance+" Watt");
        System.out.println("et avec ma capacité de "+capacite+" Litres !");
        aliment.estCuit = true;
    }
}
