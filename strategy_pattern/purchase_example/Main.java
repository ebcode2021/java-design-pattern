package purchase_example;
public class Main {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item A = new Item("소고기", 50000);
		Item B = new Item("떡볶이", 5000);

		cart.addItem(A);
		cart.addItem(B);

		// pay by Kakao
		cart.pay(new KAKAOCardStrategy("은비", "1234", "123", "2025-01-01"));

		// pay by Shinhan
		cart.pay(new SHINHANCardStrategy("ebcode2021@gmail.com", "2222"));
	}
}
