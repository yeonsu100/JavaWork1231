package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		// 변수 선언과 동시에 초기값 대입하기
		int num=1;
		String name="Winnie";
		
		// 변수를 선언만 하기
		int num2;
		String name2;
		
		// 변수를 선언하고 초기값으로 기본값(0)을 넣어주고 싶다면
		int num3=0;
		// null은 참조데이터 타입이 담길수 있는 빈 공간을 만들 때 사용한다
		String name3=null;
		
		// 빈공간에 참조값 대입하기
		name3="Chloe";
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
