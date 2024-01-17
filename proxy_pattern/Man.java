package proxy_pattern;

public class Man implements Developer{
	public void develop() {
		System.out.println("파이썬으로 개발한다.");
	}

	private void play() {
		System.out.println("내가 산 주식을 확인한다.");
	}
}
