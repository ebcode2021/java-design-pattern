package factory_pattern.coffee_example;

public class Latte extends Coffee{
	private final int price = 3000;

	@Override
	public int getPrice() {
		return this.price;
	}
}
