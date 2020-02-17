package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		MainClass04.showSum(10, 20);
		int a=30;
		int b=40;
		MainClass04.showSum(a, b);
	}
	
	// 인자로 전달된 두개의 정수를 더해서 결과값을 콘솔창에 출력하는 static 메소드
	public static void showSum(int num1, int num2) {
		int sum=num1+num2;
		System.out.println("전달된 두 수의 합:"+sum);
	}
}