package test.mypac;
/*
 * 생성자 (Constructor)
 * 
 * 1. 정의하지 않아도 default 생성자는 있다고 간주된다.
 * 2. 생성자는 return type이 없고, 이름은 클래스명과 동일하다.
 * 3. 객체를 생성(new)하는 시점에 호출된다.
 * 4. 초기화 작업을 할게 있을 때 생성자 안에서 하면된다.
 * 5. 생성자는 다중정의(over loading) 할수도 있다.
 * 6. 생성자를 하나라도 정의하면 default 생성자는 없어진다.
 * 7. 생성자도 메소드와 마찬가지로 인자를 전달받을 수 있다.
 */

public class Student {
	// 필드
	private String name;	// private : 외부에 공개하지 않고 내부에서만 사용한다는 의미
	
	// default 생성자
	public Student() {
		// 긴 코딩이 들어올수도 있다.
		System.out.println("Student() 생성자가 호출되었습니다.");
	}
	
	// String type을 인자로 전달받는 생성자
	public Student(String name) {
		// 생성자의 인자로 전달받은 data를 필드에 저장하기
		this.name=name;		// this : 내가 객체가 되었을 때 나의 필드값
	}
	
	// 메소드
	public void showInfo() {
		System.out.println("My name is "+this.name+".");
	}
}
