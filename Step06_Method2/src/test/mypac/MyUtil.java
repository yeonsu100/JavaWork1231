package test.mypac;
	/*
	 * [메소드를 만들때 고려해야 할 사항]
	 * 
	 * 1. 접근 지정자
	 * 2. static OR non static
	 * 3. return type
	 * 4. 메소드명
	 * 5. 메소드에 전달받은 인자의 갯수와 데이터 type
	 */
public class MyUtil {
	// 날씨를 콘솔창에 출력하는 메소드
	public static void showWeather() {
		System.out.println("It's snowing today!!");
	}
	
	// 날씨를 콘솔창에 출력하는 메소드 (non static)
	public void printWeather() {
		System.out.println("Also, today is windy.");
	}
	
	// 날씨를 String type으로 return하는 메소드
	public String getWeather() {
		// 날씨를 얻어오는 작업을 수행했다고 가정
		String msg="It's sunny~";
		// 날씨 정보가 있는 String type을 리턴해주기
		return msg;
	}
	
	// Pen 객체를 리턴해주는 메소드
	public Pen getPen() {
		Pen p=new Pen();
		return p;
	}

	// 총을 발사하는 메소드
	public MyUtil fire() {
		System.out.println("Bomb!!!!!!!!!!");
		// this는 메소드를 감싸고 있는 클래스로 생성된 객체의 참조값을 가리킨다
		MyUtil a=this;		// 이렇게 참조값에 담아서 사용해도 된다
		return this;		// this는 MyUtil type이다
	}
	
	// 인자로 전달받은 int type을 콘솔에 출력하는 메소드
	public void showNum(int num) {
		System.out.println("num:"+num);
	}
	// int type과 String type을 전달받는 메소드
	public void showInfo(int num, String name) {
		System.out.println("num:"+num+" name:"+name);
	}
	// Pen type을 전달받는 메소드
	public void usePen(Pen p) {
		p.write();
	}
}
