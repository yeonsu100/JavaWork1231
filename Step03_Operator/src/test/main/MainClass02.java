package test.main;
/*
*	[ 연산자 ]
*	
*	2. 증감연산자
*		: 변수에 저장된 숫자를 1씩 증가시키거나 감소시키고 싶을때 사용하는 연산자
*	종류 : ++  ,  --
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num=0;
		num++; 
		num++;
		num++;
		// 3
		
		int num2=0;
		num2--; 
		num2--;
		num2--;	
		// -3
		
		int num3=0;
		// ++ 연산자가 변수 뒤에 있으면 연산의 우선 순위가 대입연산자(=)보다 느리다
		// result1에는 0이 대입된다
		int result1 = num3++;   
		
		int num4=0;  
		// ++ 연산자가 변수 앞에 있으면 연산의 우선순위가 대입연산자(=)보다 빠르다
		// result2에는 1이 대입된다
		int result2 = ++num4;  
		
		// 이미 만들어진 변수는 다시 data type을 선언하지 않는다
		num=0;
		num2=0;
		num3=0;
		
		int result3 = num-- + ++num2 - --num3;
	}
}












