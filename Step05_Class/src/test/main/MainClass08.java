package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * 1~45 사이의 랜덤한 정수를 5번 얻어내서 콘솔창에 출력하기
		 */
		// int result=new Random().nextInt(45)+1;
		// 45는 0~44까지이므로 45에 1을 더해준다
		// 이 작업을 5번 반복한다.....는 너무 비효율 적이므로 for문을 이용하자!
		
		Random ran=new Random();
		
		for(int i=0; i<5; i++) {
			int result=ran.nextInt(45)+1;
			System.out.println(result);
		}
		
	}
}
		
//		int result1=new Random().nextInt(45)+1;
//		System.out.println(result1);
//		
//		int result2=new Random().nextInt(45)+1;
//		System.out.println(result2);
//		
//		int result3=new Random().nextInt(45)+1;
//		System.out.println(result3);
//		
//		int result4=new Random().nextInt(45)+1;
//		System.out.println(result4);
//		
//		int result5=new Random().nextInt(45)+1;
//		System.out.println(result5);
		
		
		
