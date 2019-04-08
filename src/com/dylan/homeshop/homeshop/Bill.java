package com.dylan.homeshop.homeshop;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Customer client;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    public Bill(Customer client, Delivery delivery) {
        this.client = client;
        this.delivery = delivery;
    }

    public void addProduct(Product product, int quantity) {
        this.products.put(product, quantity);
    }

    public Customer getClient() {
        return client;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    /**
     * Generate an output for the current Bill
     * @param writer object in charge of writing
     */
    public void generate(Writer writer) {
        writer.start();
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(client.getFullname());
        writer.writeLine(client.getAddress());
        writer.writeLine("");
        writer.writeLine("Mode de livraison : " + delivery);
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

    /**
     * get the total price for the current bill, including products and delivery cost
     * @return total price
     */
    public double getTotal() {
        double total = delivery.getPrice();
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }
}