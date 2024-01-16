package factory_pattern.smtp_example;

import java.util.Date;

public class GoogleMailConnector extends SMTPConnector {
	protected GoogleMailConnector(String url, String id, String password, Date connectTime) {
		super(url, id, password, connectTime);
	}

	@Override
	public void connect() {
		System.out.println("gmail SMTP 서버에 연결 성공하였습니다.[id : " + id + "]");
	}
	
}
