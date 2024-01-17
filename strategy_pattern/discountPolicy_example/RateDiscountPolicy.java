package discountPolicy_example;

public class RateDiscountPolicy implements DiscountPolicy{
	private int discountPercent = 10;

	@Override
	public int discount(Grade grade, int price) {
		if (grade == Grade.VIP) {
			return price * discountPercent / 100;
		}
		return 0;
	}
	
}
