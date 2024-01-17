package discountPolicy_example;

public class FixDiscountPolicy implements DiscountPolicy{

	private int discountFixAmount = 1000;

	@Override
	public int discount(Grade grade, int price) {
		if (grade == Grade.VIP)
			return discountFixAmount;
		return 0;
	}
}
