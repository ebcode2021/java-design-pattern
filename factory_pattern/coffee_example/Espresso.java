package factory_pattern.coffee_example;

public class Espresso extends Coffee {
	private final int price = 2000;

	@Override
	public int getPrice() {
		return this.price;
	}
}
