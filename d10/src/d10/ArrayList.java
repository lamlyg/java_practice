package d10;

public class ArrayList<T> {
	T[] arr;
	
	/*
	 	cf.
	 	String str;	-> 주소출력 : null
	 	String str2 = new String(""); -> 주소출력 : 객체의 주소 출력 (str2 : 참조변수)
	 */
	
	//add 
		//기존배열보다 한칸 큰 배열을 생성하고 추가할 데이터를 매개변수로 받아 마지막칸에 넣어주기
		//자료가 아무것도 없는 경우 -> arr가 참조하는 객체가 없을 때 -> arr가 null때
		//그렇지 않은 경우
	public void add(T data) {
		//자료가 아무것도 없는 경우 -> arr가 참조하는  객체가 없을 때 -> arr가 null일때
		if(arr=null) {
			//한칸짜리 배열을 생성
			arr = (T[])new Object[1];
			//매개변수로 받은 자료를 0번 인덱스에 넣기
			arr[0] = data;
		}
		else {//그렇지 않은 경우
			//기존 배열보다 한칸 큰 새로운 배열을 만듬
			T[] newArr = (T[]) new Object[arr.length+1];
			//기본배열의 내용을 새로운 배열에 복사
			for(int i=0;i<arr.length;i++) {
				newArr[i]=arr[i];
			}
			//마지막칸에 매개변수로 받아온 데이터를 넣기
			newArr[arr.length]=data;
			//새로만든 배열을 필드(arr 참조변수)에 연결
			arr = newArr;
		}
	}
	
	//remove
	//get
		//조회할 인덱스를 매개변수로 받아서 해당 인덱스 데이터를 리턴
	
	
}
