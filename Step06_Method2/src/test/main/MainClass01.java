package test.main;

import test.mypac.MyUtil;

public class MainClass01 {
	public static void main(String[] args) {
		// 날씨가 궁금하다면?
		// 마이유틸에 있는 쇼 웨더를 불러오면 된다
		// (스태틱이 붙어있으므로) static 메소드는 클래스명에 점을 찍어 호출하면 된다!
		MyUtil.showWeather();
		// non static 메소드 (일반 메소드)는 참조값으로 호출한다
		new MyUtil().printWeather();
		// 메소드를 호출하고 나서 리턴된 값을 변수에 담기
		String result=new MyUtil().getWeather();
		
		// Pen p=new MyUtil().getPen().write();
	}
}
