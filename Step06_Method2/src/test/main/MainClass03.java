package test.main;

import test.mypac.MyUtil;		// 다른 패키지일때 import 필수 (ctrl+spacebar)
import test.mypac.Pen;

public class MainClass03 {
	public static void main(String[] args) {
		// MyUtil 클래스에 정의된 showNum() 메소드를 호출해보세요
		new MyUtil().showNum(1);		// showNum(정수 아무거나 입력)
		// MyUtil 클래스에 정의된 showInfo() 메소드를 호출해보세요
		new MyUtil().showInfo(2, "Winnie");
		// MyUtil 클래스에 정의된 usePen() 메소드를 호출해보세요
		new MyUtil().usePen(new Pen());		// Pen type의 참조값
	}
}
