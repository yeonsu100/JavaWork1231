package test.mypac;

public class Counter {
	
	// int type을 저장할 public static field 정의하기
	public static int count=0;

	public static void addCount() {
		// 이 메소드가 몇번 호출되었는지 자체적으로 저장하고싶다면?
		Counter.count++;
	}
}
