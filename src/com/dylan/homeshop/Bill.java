package com.dylan.homeshop;

import java.beans.Customizer;
import java.util.HashMap;
import java.util.Map;

public class Bill {

    private Client client1;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    public Bill(Client client, Delivery delivery){
        this.client1 = client;
        this.delivery = delivery;
    }

    /**
     * Ajoute un produit avec ça quatite a la facture (Bill)
     * @param product Le produit iajouté
     * @param quantite La quantité voulue
     */
    public void addProduct(Product product, Integer quantite){

        this.products.put(product, quantite);
    }

    public Client getClient() {

        return client1;
    }

    public Map<Product, Integer> getProducts() {

        return products;
    }

    public void generate(Writer writer){
        writer.start();

        writer.writeLine("HomeShop compagnie");

        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");

        writer.writeLine("");

        writer.writeLine("Facture à l'attention de : ");

        writer.writeLine(client1.getFullname());

        writer.writeLine(client1.getAddress());

        writer.writeLine("");

        writer.writeLine("Mode de livraison : " + delivery.getPrice());

        writer.writeLine("");

        writer.writeLine("Produits : ");

        writer.writeLine("-----------------------------------------------------");

        for (Map.Entry<Product, Integer> entry : products.entrySet()) {

            Product product = entry.getKey();

            Integer quantity = entry.getValue();

            writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");

            writer.writeLine(product.getDescription());

            writer.writeLine("");

        }

        writer.writeLine("Livraison : " + delivery.getPrice());

        writer.writeLine("-----------------------------------------------------");

        writer.writeLine("Total : " + this.getTotal());

        writer.stop();

    }

    public double getTotal(){
        double total = delivery.getPrice();

        for (Map.Entry<Product, Integer> entry : products.entrySet()) {

            Product product = entry.getKey();

            Integer quantity = entry.getValue();

            total += product.getPrice() * quantity;

        }

        return total;
    }


}
