# Singleton Pattern

## 1. 싱글톤 패턴이란?
싱글론 패턴은 클래스의 인스턴스를 프로그램 실행 중에 한 번만 생성하고 계속 재사용하는 패턴이다.

## 2. 싱글톤 패턴을 사용하는 경우
클래스의 데이터를 변환하지 않고 계속적으로 사용할 때 \
프로그램에서 동일한 커넥션 객체를 만들 때 \
모든 객체에서 데이터를 공유해야 하는 경우 \
리소스를 다루는 클래스 (File IO, Socket)

## 3.장단점
### 장점
하나의 인스턴스를 사용하기 때문에 메모리 낭비를 방지할 수 있다. \
다른 클래스의 인스턴스들이 데이터를 공유하기 쉽다.

### 단점
단일 책임 원칙을 위반한다. \
(1. 클래스에 하나의 인스턴스만 존재하게 함 2. 해당 인스턴스에 대한 전역 접근 지점 제공) \
멀티스레드 환경에서 동기화처리를 해주지 않으면 인스턴스가 2개 생기는 경우가 발생한다.\
단위 테스트하기 어렵다.

## 4. 구현
☑️ 다른 객체들이 new 연산자를 사용하지 못하도록 default 생성자를 private으로 설정한다. \
☑️ 생성자 역할을 하는 정적 생성 메서드가 필요하다.

```
public class Singleton {
	private static Singleton instsacne;

	private Singleton() {}

	public static Sigleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
```
