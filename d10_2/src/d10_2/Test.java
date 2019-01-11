package d10_2;

/*
 	예외	
 		
 		에러 vs 예외
 		
 		에러 
 			컴퓨터 하드웨어의 오동작 또는 고장으로 인해 응용프로그램 실행 오류가 발생
 			JVM실행에 문제가 생김, 에러 대체 불가
 			
 		예외
 			사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 발생하는 오류
 			
 	예외처리
 	
 	예외의 종류
 		일반예외(Exception)
 			컴파일러 체크 예외 : 컴파일과정에서 예외처리 코드 검사
 		실행예외(Runtime Exception)
 			컴파일과정에서 예외처리 검사 안함
 			
 	실행예외
 		개발자의 경험에 의해서 처리
 		실행예외에 대한 예외처리 코드가 없는 경우 해당예외가 발생하면 프로그램은 비정상 종료
 		
 		NullPointerException
 			: 객체가 없는 상태에서 객체를 사용하려고하면 발생하는 예외
 			
 		ArrayIndexOutBoundsException
 			: 배열에서 인덱스 범위를 초과하여 사용할 경우
 			
 		NumberFormatException -> (ex) int num = Integer.parseInt("ten");   
 			: 문자열을 숫자로 변환하려고 할 때 숫자로 변환할 수가 없는 문자가 포함되어있으면 발생
 			=> Exception in thread "main" java.lang.NumberFormatException: For input string: "ten"
 			
 		ClassCastException
 			: 타입변환 (상위-하위, 인터페이스-구현)시 관계가 없는 타입으로 억지로 변환하려고 할때 발생
 	
 	예외처리
 		예외가 발생했을때 프로그램의 갑작스러운 종료를 막고
 		정상실행을 유지할 수 있도록 처리하는 코드
 		
 	try{
 		예외가 발생가능한 코드들
 	}
 	catch{
 		 예외를 처리하는 코드
 	}
 	finally{
 	}

 	
 	finally
 		생략가능
 		finally안에 있는 코드는 try블록이 끝나면 무조건 실행됨
 		예외가 발생하든 발생하지 않았든 항상 실행되어야하는 코드는 finally에 넣을 수 있음
 */

public class Test {
	public static void main(String[] args) {
		int x=1;
		int y=0;
		
		try {
			int result = x/y; //0으로 나누면 안됨!  -> 예외가 발생가능한 부분
		}
		catch (Exception e){
			System.out.println("0으로는 못나눔!");
		}
		System.out.println("???");
	}
}
