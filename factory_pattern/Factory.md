# Factory Pattern

## 1. 팩토리 패턴이란?
객체를 사용하는 코드에서 객체 생성 부분을 떼어내 추상화한 패턴 \
상속 관계에 있는 두 클래스에서 상위 클래스가 뼈대를 결정하고, 하위 클래스에서는 객체 생성에 관한 구체적인 내용을 결정하는 패턴 \
주로 인터페이스나 추상 클래스를 사용하여 객체를 생성하며, 클라이언트 코드는 구체적인 클래스의 생성 로직을 몰라도 되어 유연성과 확장성을 제공한다. ***"생성과 사용을 분리한다"*** 는 원칙을 따른다.

## 2. 팩토리 패턴을 사용하는 경우
객체 생성 코드를 클라이언트 코드로부터 분리하고 싶을 때 \
서브클래스에 의한 객체 생성을 피하고자 할 때 \
생성되는 객체의 종류가 동적으로 결정되야 할 때 \
객체 생성 로직을 변경하더라도 클라이언트 코드에 영향을 미치지 않기 원할 때 

## 3.장단점
### 장점
객체 생성과 사용을 분리하여 유연성과 확장성을 제공한다. \
클라이언트 코드는 구체적인 클래스에 대한 정보를 알 필요가 없다. 

### 단점
팩토리 클래스가 계속해서 증가할 수 있으며, 이로 인해 유지보수가 어려워질 수 있다. \
객체 생성에 대한 책임을 가진 팩토리 클래스가 추가로 필요하다.

## 4. 구현
☑️ 팩토리 메서드의 이름은 생성되는 객체의 목적을 명확히 나타내야 한다. \
☑️ 팩토리 메서드들을 담당하는 클래스를 분리하여 단일 책임 원칙을 지켜야한다. 각 팩토리 클래스는 특정 유형의 객체 생성에만 집중하도록 설계되어야 한다. \
☑️ 반환 타입이 구체적인 타입을 반환하는 경우, 클라이언트가 해당 타입에 의존하게 되므로, 항상 추상화된 타입을 반환해야 한다.