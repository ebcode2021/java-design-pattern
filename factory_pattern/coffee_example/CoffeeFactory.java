package factory_pattern.coffee_example;

public class CoffeeFactory {
	public static Coffee getCoffee(String type) {
		if ("Latte".equalsIgnoreCase(type))
			return new Latte();
		else if ("Americano".equalsIgnoreCase(type))
			return new Americano();
		else
			return new Espresso();
	}
}