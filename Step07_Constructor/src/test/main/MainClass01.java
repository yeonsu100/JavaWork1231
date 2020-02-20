package test.main;

import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("Winnie");
		Student s3=new Student("Chloe");
		String yourName="Susan";
		Student s4=new Student(yourName);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		
		// s1.name <- private으로 은닉해놓았기 때문에 보이지 않는다 (외부에서 사용하는 부품들을 저장해놓는 경우가 많다)
		// 또한 필드가 private으로 되어있는 상태에서 이미 값을 주지 않았기 때문에 s1.name="Winnie";라고 할 수 없다.
	}
}
