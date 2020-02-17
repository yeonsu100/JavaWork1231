package test.main;

public class MainClass01 {
	
	// run했을 때 실행순서가 시작되는 특별한 메소드
	public static void main(String[] args) {
		System.out.println("main() 메소드 시작됨");
		/*
		 *  [static 메소드를 호출하는 방법]
		 *  static 메소드를 가지고있는
		 *  클래스명.메소드명()
		 *  와 같은 형식으로 호출해야 한다.
		 *  
		 *  동일한 클래스 내에 있는 메소드인 경우에는 클래스명 생략 가능
		 *  (예 : 그냥 winnie(); 이렇게 호출해도 됨)
		 */
		//MainClass01.winnie();
		System.out.println("main() 메소드 종료됨");
	}
	
	public void winnie () {
		System.out.println("winnie() 메소드 시작됨");
		
		System.out.println("winnie() 메소드 종료됨");
	}
}
