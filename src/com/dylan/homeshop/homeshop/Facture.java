package com.dylan.homeshop.homeshop;

import java.util.HashMap;
import java.util.Map;

public class Facture {

    private Client client;
    private Map<Produit, Integer> produits = new HashMap<Produit, Integer>();
    private Delivery delivery;

    public Facture(Client client, Delivery delivery) {
        this.client = client;
        this.delivery = delivery;
    }

    /**
     * Ajoute un produit et une quantité a la facture
     * @param produit Le produit concerné
     * @param quantity La quantité a ajouté
     */

    public void ajoutProduit(Produit produit, Integer quantity){
        this.produits.put(produit, quantity);
    }

    public Client getClient(){
        return client;
    }

    public Map<Produit, Integer> getProduits(){
        return produits;
    }
}
