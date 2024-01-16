package factory_pattern.smtp_example;

public class Main {
	public static void main(String[] args) {
		try {
			SMTPConnector conn = ConnectorFactory.builder()
								.url("smtp.google.com")
								.id("ebcode2021@gmail.com")
								.password("1234")
								.build()
								.getConnector();
			conn.connect();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
