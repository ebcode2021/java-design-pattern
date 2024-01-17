package proxy_pattern;

public class MyAspect implements Developer{
	
	private Developer developer;

	public MyAspect(String className) {
		try {
			developer = (Developer)Class.forName(className).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void develop() {
		System.out.println("---- 하루의 시작 ----");
		System.out.println("출근 카드를 찍는다.");
		try {
			developer.develop();
		} catch(Exception e) {
			System.out.println("아, 그러고 보니 쉬는 날이였다.");
		} finally {
			System.out.println("집에 간다.");
		}
	}
}
