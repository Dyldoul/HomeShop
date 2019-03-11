package com.dylan.homeshop.homeshop;

public class Main {

    public static void main(String[] args) {

        Produit cafe = new Produit("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);

        Television tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");

        Frigo fridge = new Frigo("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);



        Client client = new Client("Juste Leblanc", "19 rue Germain Pilon, Paris");



        Facture facture = new Facture(client);

        facture.ajoutProduit(cafe, 1);
        facture.ajoutProduit(tv, 1);
        facture.ajoutProduit(fridge, 1);
    }

}
