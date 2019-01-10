package d09_2;
/*
 	제네릭
	일반적인 코드를 작성하고 이 코드를 다양한 타입의 객체에 재사용하는 프로그래밍 기법
	제네릭은 컬렉션 라이브러리에 사용 多
 */

import java.util.Arrays;

public class MyArrayList<T> {//제네릭 클래스 
	T[] arr;
	T[] temp;

	int size;

	MyArrayList(){
		size=0;
		//arr = (T[])new Object[size];
		//Object[] arr = new T[size];
	}

	//add-맨뒤에 추가
	void add(T value){
		if(size==0) {
			arr = (T[])new Object[1];
			arr[0]=value;
		}
		else{
			temp = (T[])new Object[size+1];
			for(int i=0;i<size;i++) {
				temp[i]=arr[i];
			}
			temp[size]=value;
			arr = (T[])new Object[size+1];
			for(int j=0;j<size+1;j++) {
				arr[j]=temp[j];
			}
		}
		size++;
	}

	//remove-index값에 해당하는 데이터 삭제
	void remove(int index) {
		temp = (T[])new Object[size];
		for(int i=0;i<index;i++) {
			temp[i]=arr[i];
		}
		for(int j=index+1;j<size;j++) {
			temp[j-1]=arr[j];
		}
		size--;
		arr = (T[])new Object[size];
		for(int i=0;i<size;i++) {
			arr[i]=temp[i];
		}
	}

	//get-index값에 따라서 가져오기
	T get(int index) {
		return arr[index];
	}

	//set-index값에 해당하는 데이터 수정
	void set(int index, T value) {
		arr[index]=value;
	}

	//toString-전체출력
	@Override
	public String toString() {
		return "MyArrayList [arr=" + Arrays.toString(arr) + "]";
	}

	
}
