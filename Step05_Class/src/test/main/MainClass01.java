package test.main;

import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		// Car Type 객체의 drive() 메소드 호출하기
		new Car().drive();
		// 순간적으로 실행된 후 종료되고 끝난다
		// Car Type 객체의 필드를 참조하여 대입연산자로 (적절한 데이터타입) 값 대입하기
		new Car().brand="Tesla";
		// Car Type 객체의 필드에 저장된 값 읽어오기
		String a=new Car().brand;
	}
}
