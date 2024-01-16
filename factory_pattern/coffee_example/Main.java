package factory_pattern.coffee_example;

public class Main {
	public static void main(String[] args) {
		Coffee latte = CoffeeFactory.getCoffee("Latte");
		Coffee americano = CoffeeFactory.getCoffee("Americano");
		System.out.println("Factory Latte : " + latte);
		System.out.println("Factory Americano : " + americano);
	}
}
