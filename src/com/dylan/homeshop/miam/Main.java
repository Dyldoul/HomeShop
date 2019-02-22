package com.dylan.homeshop.miam;

public class Main {

    public static void main(String[] args) {

        Four grandFour = new Four();
        grandFour.capacite = 55;
        grandFour.capacite = 260;

        Alliments cake = new Alliments();
        cake.nom = "Cake marbré";
        cake.estCuit = false;
        cake.manger();
        System.out.println("");
        grandFour.cuire(cake);
        System.out.println("");
        cake.manger();
    }
}
