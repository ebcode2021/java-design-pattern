package discountPolicy_example;

public class OrderService {
	private final Grade grade;
	private final DiscountPolicy discountPolicy;

	public OrderService(Grade grade, DiscountPolicy discountPolicy) {
		this.grade = grade;
		this.discountPolicy = discountPolicy;
	}

	public void order(int itemPrice) {
		int discount = discountPolicy.discount(grade, itemPrice);

		System.out.println("현재 당신의 Grade는 " + grade + "입니다.");
		System.out.println("선택된 할인 정책에 따라 원가 " + itemPrice + "원에서 할인 금액은 " +
			discount + "원 입니다.");
	}
}
