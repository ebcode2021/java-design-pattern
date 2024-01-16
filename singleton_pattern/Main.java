package singleton_pattern;

public class Main {
	public static void main(String[] args) {
		/* singleton */
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		
		if (a.equals(b)) {
			System.out.println("싱글톤은 같은 객체를 반환 합니다.");
		}
	}
}
