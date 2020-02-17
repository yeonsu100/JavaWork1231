package test.main;

// 다른 package에 있는 클래스를 사용하려면 import를 해야 한다.
import test.mypac.YourUtil;

public class MainClass06 {
	// run했을 때 실행순서가 시작되는 특별한 main() 메소드
	public static void main(String[] args) {
		/*
		 * 프로그래밍의 목적이
		 * 1. 파일을 업로드하고
		 * 2. 파일을 다운로드 하는것이 목적이라면?
		 */
		YourUtil.fileup();
		YourUtil.filedown();
	}
}
