package factory_pattern.coffee_example;

public class Americano extends Coffee {
	private final int price = 2500;

	@Override
	public int getPrice() {
		return this.price;
	}
}
