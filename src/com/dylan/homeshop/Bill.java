package com.dylan.homeshop;

import java.beans.Customizer;
import java.util.Map;

public class Bill {

    private Client client;
    private Map<Product, Integer> products;

    public Bill(Client client){
        this.client = client;
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
