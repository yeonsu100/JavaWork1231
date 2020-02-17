package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main() 메소드가 시작되었습니다");
		/*
		 * Car type 객체를 3개 생성해서 
		 * 참조값을 c1, c2, c3라는 지역변수에 담아보세요.
		 */
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		/*
		 * c1, c2, c3 안에 있는 참조값을 이용해서 
		 * 본인이 좋아하는 자동차 브랜드 3개를 각각 객체의 필드에 저장해보세요.
		 */
		c1.brand="Lexus";
		c2.brand="BMW";
		c3.brand="TOYOTA";
		
		/*
		 * c1, c2, c3 안에 있는 참조값을 이용해서 
		 * showBrand() 메소드를 각각 호출해보세요.
		 */
		c1.showBrand();
		c2.showBrand();
		c3.showBrand();
	}
}
