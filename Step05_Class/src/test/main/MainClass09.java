package test.main;

import test.mypac.WinnieUtil;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * 1~45 사이의 랜덤한 정수를 5번 얻어내서 콘솔창에 출력하기
		 */
		/* MainClass08과 똑같지만 객체를 new하지 않고 (새로 만들지 않고) 
		 * WinnieUtil에 있는 키값을 복사하여 사용한 것이다.
		 * (import 역시 위니 유틸만 하면 된다)
		 */
		
		for(int i=0; i<5; i++) {
			int tmp=WinnieUtil.ran.nextInt(45)+1;
			WinnieUtil.out.println(tmp);
		}
		
	}
}
