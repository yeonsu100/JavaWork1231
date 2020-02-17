package test.mypac;

public class Dragon {
	// 드래곤이 초창기에 갖고있는 체력 필드 (숫자값이므로 int로 설정)
	public int energy=200;
	// 드래곤이 갖는 공격력 필드
	public static int attDamage=20;
	
	// 공격하는 메소드
	public void attack() {
		System.out.println(Dragon.attDamage+" 의 데미지의 공격을 해요");
	}
	// 움직이는 메소드
	public void move() {
		System.out.println("움직여요");
	}
	// 데미지를 입는 메소드 (에너지를 줄이는)
	public void damage() {
		this.energy-=10;
	}
}
