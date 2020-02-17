package test.mypac;
/*
 * [ 클래스의 용도 ]
 * 
 * 1. static필드나 메소드를 감싸는 역할
 * 2. 객체의 설계도 역할
 * 3. Data type 역할
 * 
 * 이 중 이번 예제를 통해 "2.객체의 설계도 역할"을 알아본다
 */
public class Car {
	// 제조사 (저장소 - 필드)
	public String brand=null;	//  원래는 널값을 넣어주어야 하지만 필드는 그냥 선언만해도 가능하다
	
	// 달리는 기능 (메소드)
	public void drive() {
		System.out.println("달려요!");
	}	
	// 제조사를 출력하는 기능 (메소드)
	public void showBrand() {
		System.out.println("제조사:"+this.brand);
	
	}
}
