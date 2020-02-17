package test.main;
/*
 *  [ 연산자 ]
 *  
 *  6. 3항 연산자
 *  
 *  -  
 *  
 */
public class MainClass06 {
	public static void main(String[] args) {
		int point=70;
		
		//String msg=null;
		
		//if(point>=60) {
		//	msg="Pass";
		//} else {
		//	msg="Fail";
		//}
		
		String msg=point>=60?"Pass":"Fail" ;
		
		int a=point>=60?100:0;
		double b=point>=70?100.0:0.0;
		
		System.out.println(msg);
	}
}











