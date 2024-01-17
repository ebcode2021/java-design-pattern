package proxy_pattern;

public class ManProxy implements Developer {
	public void develop() {
		new Man().develop();
		System.out.println("내가 가짜인거 모르겠지");
	}
}
