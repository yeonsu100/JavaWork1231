package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 메소드를 호출하면서 참조값을 바로 즉석에서 만들어 전달하기
		MainClass02.showMsg("Hi Aloha~");
		MainClass02.showMsg("Let's study 'JAVA'");
		
		String str="It's so exciting";
		// 메소드 호출하면서 변수 안에 있는 참조값을 전달하기
		MainClass02.showMsg(str);
	}
	// 메소드의 인자로 String type을 전달받는 static 메소드 정의하기
	public static void showMsg(String msg) {
		// 전달받은 내용을 가공해서 출력하기
		String result="["+msg+"]";
		System.out.println(result);
	}
	public void test() {
		String str="Hey";
		String msg=str;
	}
}
