package test.main;
/*
 *  [ 연산자 ]
 *  
 *  4. 논리연산자
 *  
 *  - boolean type 데이터를 연산해주는 연산자이다
 *  
 * || : or 연산
 * && : and 연산
 * !  : not 연산, boolean ���� ������Ų��. 
 *      true => false, false => true 
 */
public class MainClass04 {
	public static void main(String[] args) {
		//or 
		boolean result1 = false || false; //false
		boolean result2 = false || true; //true
		boolean result3 = true || false; //true
		boolean result4 = true || true; //true
		
		//and 
		boolean result5 = false && false; //false
		boolean result6 = false && true; //false
		boolean result7 = true && false; //false
		boolean result8 = true && true; //true
		
		//not 
		boolean result9 = !true; //false
		boolean result10 = !false; //true
		
		boolean isRun=false;
		if(isRun != true){
			System.out.println("달리지 않아요");
		}
		
		// isRun!=true를 간단히 하면 !isRun과 같다
		if(!isRun){
			System.out.println("달리지 않아요");
		}
	}	
}




















