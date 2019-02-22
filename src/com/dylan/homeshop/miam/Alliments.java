package com.dylan.homeshop.miam;

public class Alliments {

    String nom;
    boolean estCuit;

    public void manger(){
        if (estCuit){
            System.out.println("Miam cet aliment : "+nom+" est cuit !");
        } else {
            System.out.println("Berk l'aliment : "+nom+" est cru !");
        }
    }
}
