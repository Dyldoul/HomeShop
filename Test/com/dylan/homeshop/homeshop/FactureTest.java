package com.dylan.homeshop.homeshop;

import static org.junit.jupiter.api.Assertions.*;

class FactureTest {

    private String output;
    private Writer writerMock = new Writer() {
        @Override
        public void start() {
            output = "";
        }

        @Override
        public void writeLine(String line) {
            output += line + "%n";
        }

        @Override
        public void stop() {
        }
    };

    private Produit cafe = new Produit("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
    private Produit tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
    private Frigo fridge = new Frigo("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
    private Client customer = new Client("Juste Leblanc", "19 rue Germain Pilon, Paris");
    private Delivery lowCostRelayDelivery = new RelayDelivery(27);

    @Test
    public void Given_2productsAndDelivery_When_generatingBill_Then_getGoodLineNumber() {
        Facture bill = new Facture(customer, lowCostRelayDelivery);
        bill.ajoutProduit(cafe, 1);
        bill.ajoutProduit(tv, 1);
        bill.generate(writerMock);
        int lineNumber = output.split("\n").length;
        assertEquals(20, lineNumber);
    }

    @Test
    public void Given_3productsAndDelivery_When_generatingBill_Then_getGoodTotal() {
        Facture bill = new Facture(customer, lowCostRelayDelivery);
        bill.ajoutProduit(cafe, 1);
        bill.ajoutProduit(tv, 1);
        bill.ajoutProduit(fridge, 1);
        assertEquals(870.98, bill.getTotal(), 0.01);
    }

}