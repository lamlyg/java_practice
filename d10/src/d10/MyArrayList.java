package d10;

public class MyArrayList<T> {
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
		if(arr==null) {
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
	/*
	 	삭제할 데이터의 인덱스를 매개변수로 받아서 삭제
	 	원래배열보다 한칸 작은 배열을 만들어서 해당인덱스(삭제할)만 빼고 다 복사
	 	새롭게 만든 배열을 참조변수에 연결
	 */
	public void remove(int index) {
		if(arr==null || arr.length==1 ) {//참조하고 있는 객체가 없거나 크기가 1이면 (비어있거나 배열이 하나만 있을 경우)
			arr = null;
			return;
		}
		else {
			T[] newArr = (T[]) new Object[arr.length-1];
			for(int i =0;i<arr.length;i++) {
				if(i<index) newArr[i] = arr[i];
				else if (i==index) continue; //삭제할 인덱스 -> 그냥 무시
				else newArr[i-1]=arr[i];
			}
			arr = newArr;
		}
		
	}
	
	//get
		//조회할 인덱스를 매개변수로 받아서 해당 인덱스 데이터를 리턴
	public T get(int index) {
		if(arr==null) return null;
		else return arr[index];
	}
	
	
	//set
		//수정할 인덱스, 데이터를 매개변수로 받아서 해당인덱스 데이터를 변경할 데이터로 수정
	public void set(int index, T data) {
		if(arr == null) return; //참조하는 객체가 없다면 그냥 리턴
		else arr[index] = data;
	}
	
	//toString
	
	public void printArray() {
		if(arr !=null) {
			for(T d : arr) {
				System.out.print(d + " ");
			}			
		}
		System.out.println();
	}
	
}
