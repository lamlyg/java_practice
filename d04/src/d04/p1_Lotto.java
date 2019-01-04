//p1_Lotto

package d04;

//6칸짜리의 배열을 만들고 로또번호 생성기 만들기
//1~45까지의 난수를 생성
//Math라는 객체에는 각종 수학적 기능이 들어있음
//중복번호 무시

public class p1_Lotto {
	public static void main(String[] args) {
		//Math.random()은 0.00000000~0.99999999까지의 임의의 숫자를 가져다 줌
		//System.out.println(Math.random());
		
		int i=0,j=0;
		
		int []arr = new int[6];
		
		arr[0]=(int)(Math.random()*45+1);
		//난수 최소(min)~최대(max) -> Math.random()*max + min
		
		for(i=1;i<6;i++) {
			j=0;
			arr[i]=(int)(Math.random()*45+1);
			while(j<i) {
				if(arr[i]!=arr[j]) j++;
				else {
					j=0;
					arr[i]=(int)(Math.random()*45+1);
				}
			}
			
		}
		
		System.out.println("축하합니다! 이번주 로또 당첨번호는 ");
		for(i=0;i<6;i++) {
			System.out.print(arr[i]+" ");
		}
		
//		//forEach문
//		for(데이터타입 변수명 : 배열이름) {
//			
//		}
//		for(int n :num) {//변수n에는 첫번째 배열원소부터
//			//마지막 배열원소까지 차례대로 대입
//			System.out.println(n);
//		}
	}
}
