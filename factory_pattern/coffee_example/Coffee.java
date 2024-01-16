package factory_pattern.coffee_example;

abstract class Coffee {
	public abstract int getPrice();

	@Override
	public String toString() {
		return "음료의 가격은 " + this.getPrice() + "입니다.";
	}
}
