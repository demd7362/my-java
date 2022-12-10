interface Phone {
	void call();
	void message();
	default void whenDrop() {
		System.out.println("떨어트리면 망가집니다");
	}
	static void internet() {
		System.out.println("인터넷을 쓰면 돈이 엄청나게 빠져나갑니다.");
	}
}

//  interface의 default 메소드
//
//- interface에서도 메소드 구현이 가능하다.
//
//- 참조 변수로 함수를 호출할 수 있다.
//
//- implements한 클래스에서 재정의가 가능하다.


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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		
	}

	
	
}

public class DefaultMethodExample {
	public static void main(String[] args) {
		Phone phone = new SmartPhone();
		phone.whenDrop();
		Phone.internet(); // 인스턴스 변수로 생성하면 찾을 수 없는 메소드
	}
	
}
