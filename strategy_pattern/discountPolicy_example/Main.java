package discountPolicy_example;

public class Main {
	public static void main(String[] args) {
	
	OrderService orderService = new OrderService(Grade.VIP, new FixDiscountPolicy());

	orderService.order(50000);
	}
}
