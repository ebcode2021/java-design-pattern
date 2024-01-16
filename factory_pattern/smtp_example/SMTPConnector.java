package factory_pattern.smtp_example;

import java.util.Date;

public abstract class SMTPConnector {
	protected	String	url;
	protected	String	id;
	protected	String	password;
	protected	Date	connectTime;

	public SMTPConnector(String url, String id, String password, Date ConnectTime) {
		super();
		this.url = url;
		this.id = id;
		this.password = password;
		this.connectTime = new Date();
	}

	public abstract void connect();

	@Override
	public String toString() {
		return "SMTPConnector [url=" + url + ", id=" + id + ", password=" + password + ", ConnectTime=" + connectTime + "]";
	}
}
