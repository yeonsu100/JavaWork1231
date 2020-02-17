package test.main;

import java.io.PrintStream;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * 달려야 한다면?
		 */
		Car c1=new Car();
		c1.drive();
		// Car type 객체의 field에 String type 참조값 대입하기
		c1.brand="Tesla";
		c1.showBrand();
		
		//PrintStream a=System.out;
		//a.println("오잉?");
	}
}
