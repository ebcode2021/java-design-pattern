package purchase_example;
public class SHINHANCardStrategy implements PaymentStrategy {
	private String emailId;
	private String password;

	public SHINHANCardStrategy(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Shinhan Card");
	}
}
