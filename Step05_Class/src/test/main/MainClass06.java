package test.main;

import test.mypac.Dragon;

public class MainClass06 {
	public static void main(String[] args) {
		// Dragon 객체를 생성해서 공격하기
		Dragon d1=new Dragon();
		d1.attack();
		d1.move();
		
		// Dragon 객체를 생성해서 데미지 입히기
		Dragon d2=new Dragon();
		d2.attack();
		d2.damage();
		
		System.out.println("---- 공격력 up 후 ----");
		Dragon.attDamage=30;
		
		d1.attack();
		d2.attack();
	}
}
