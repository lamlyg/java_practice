package d10_2;
/*
 	배열에서 인덱스 범위가 벗어나도 예외가 발생함
 	크기가 10인 배열을 생성하고 11번째 원소에 0을 대입해보고
 	이 예외를 처리할 수 있는 try-catch블록만들기
 */
public class Test2 {
	public static void main(String[] args) {
		int []arr = new int[10];
		
		try {
			arr[11]=0;
//		}catch (Exception e) {//Exception=>클래스 -> Exception의 하위클래스에 속하는 것 : 실행예외에 나온것
//			// TODO: handle exception
//			System.out.println("배열의 크기는 10입니다.");
//			e.printStackTrace();
		}//첫번째 catch문 : 예외가 발생하면 다 잡아주지만 어떤 예외인지 정확히 알기 힘듬
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("범위넘음!");
		}//두번째 catch문 : 어떤 예외인지 유형을 알 수 있음 
		//(해당예외만 잡아줌 -> ArrayIndexOutOfBoundsException : index에 대한 예외를 잡아줌)
		System.out.println("???");
	}
}