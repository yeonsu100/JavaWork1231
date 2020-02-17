package test.main;
/*
 *  [ Java의 참조 데이터 type ]
 *  
 *  String
 *   - 문자열을 다룰때 사용하는 데이터  type이다
 */
public class MainClass05 {
	public static void main(String[] args) {
		String name="Winnie";
		String msg="Hi, Aloha";
		String fortune="If you live in Hawaii, you'll be a super rich!";
		String fortuneToday="You'll have a nice dinner!";
		
		// name안에 들어있는 참조값을 tmp1 변수에 대입하기 (참조값 복사)
		String tmp1=name;
		String tmp2=msg;
		
		int num=10;
		// num 안에 들어있는 value를 tmp3 변수에 대입하기 (value 복사)
		int tmp3=num;
		
		// String type객체의 메소드 호출하기
		int a=tmp1.length();
	}
}
