package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// showNum() 메소드를 호출하는 코드를 작성해보세요
		MainClass03.showNum(19921208);	
		// 문법만 성립시키면 되므로 대충 아무 숫자나 넣으면 된다 (int이므로 20억 이하의 숫자로)
		
		int a=999;
		// showNum() 메소드를 호출할 때 a 변수 안에 있는 값을 전달해보세요
		MainClass03.showNum(a);
	}
	public static void showNum(int num) {
		System.out.println("num:"+num);
	}
	
	//public void test() {
	//	int num=10;
	//}
}
