package test.main;
/*
 *  [ 연산자 ]
 *  
 *  5. 대입 연산자
 * 	 : 우측에 있는 값을 대입
 *  
 * 종류 : =, +=, -=, *=, /=, %=
 */
public class MainClass05 {
	public static void main(String[] args) {
		int num=10;
		//num = num+2;
		num += 2;	
		//num = num-3;
		num -= 3;		
		//num = num*4;
		num *= 4;
		//num = num/5; (원래있는 값에서 5를 나눈값을 대입)
		num /= 5;
		//num = num%6;	(원래있는 값에서 6을 나눈 나머지값을 대입)
		num %= 6;		
	}
}





