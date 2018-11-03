package com.dylan.homeshop;

import java.beans.Customizer;
import java.util.HashMap;
import java.util.Map;

public class Bill {

    private Client client;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    public Bill(Client client, Delivery delivery){
        this.client = client;
        this.delivery = delivery;
    }

    /**
     * Ajoute un produit avec ça quatite a la facture (Bill)
     * @param product Le produit iajouté
     * @param quantite La quantité voulue
     */
    public void addPrduct(Product product, Integer quantite){

        this.products.put(product, quantite);
    }

    public Client getClient() {

        return client;
    }

    public Map<Product, Integer> getProducts() {

        return products;
    }


}
