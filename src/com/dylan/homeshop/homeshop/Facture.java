package com.dylan.homeshop.homeshop;

import java.util.Map;

public class Facture {

    private Client client;
    private Map<Produit, Integer> produits;

    public Facture(Client client) {
        this.client = client;
    }

    /**
     * Ajoute un produit et une quantité a la facture
     * @param produit Le produit concerné
     * @param quantite La quantité a ajouté
     */
    public void ajoutProduit(Produit produit, Integer quantite){
        this.produits.put(produit, quantite);
    }

    public Client getClient(){
        return client;
    }

    public Map<Produit, Integer> getProduits(){
        return produits;
    }
}
