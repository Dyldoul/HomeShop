package com.dylan.homeshop;

public class Main {

	public static void main(String[] args) {
		Product cafe = new Product("Philips HD78", "Noir - 1 a 2 tasse", 79.99);
		TV tv = new TV("Samsung", "Smart TV LED", 599, 49, "LED");
		Frigo freezer = new Frigo("BEKO TSE", "Frigo BEKO - Classe A+ - blanc", 189, 130, false);

		Client client1 = new Client("Juste Leblanc", "19 rue Germain Pilon Paris");

		Bill bill = new Bill(client1, new RelayDelivery(27));

		bill.addProduct(cafe, 1);
		bill.addProduct(tv, 1);
		bill.addProduct(freezer, 1);

		bill.generate(new Writer() {

			@Override

			public void start() {


			}


			@Override

			public void writeLine(String line) {

				System.out.println(line);

			}


			@Override

			public void stop() {


			}
		});
	}
}