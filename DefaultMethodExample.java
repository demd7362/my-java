interface Phone {
	void call();
	void message();
	static void whenDrop() {
		System.out.println("떨어트리면 망가집니다");
	}
	default void internet() {
		System.out.println("인터넷을 쓰면 돈이 엄청나게 빠져나갑니다.");
	}
	default void slide() {
		System.out.println("슬라이드 폰입니다.");
	}
	
}

//  interface의 default 메소드
//
//- interface에서도 메소드 구현이 가능하다.
//
//- 참조 변수로 함수를 호출할 수 있다.
//
//- 재정의가 가능하다.


//  interface의 static 메소드 
//
//- interface에서 메소드 구현이 가능하다.
//
//- 반드시 클래스 명으로 메소드를 호출해야 한다.
//
//- 재정의 불가능!

class SmartPhone implements Phone {

	@Override
	public void call() {
		
		
	}

	@Override
	public void message() {
		
		
	}
	public void internet() {
		System.out.println("인터넷을 쓰면 데이터 사용량이 빠져나갑니다.");
	}
	public void youtube() {
		System.out.println("유튜브 재생이 가능합니다");
		
	}
	
}

public class DefaultMethodExample {
	public static void main(String[] args) {
		Phone phone = new SmartPhone();
		Phone.whenDrop(); // static 메소드 사용
		phone.slide(); // default 메소드 사용
		phone.internet(); // default 메소드 재정의. 이 경우 인터페이스의 internet() 메소드는 없는거나 마찬가지이다
		
		SmartPhone smartPhone = (SmartPhone)phone; // == SmartPhone smartPhone = new SmartPhone();
		smartPhone.youtube();
	}
	
}
