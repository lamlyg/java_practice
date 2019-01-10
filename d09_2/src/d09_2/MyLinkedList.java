//package d09_2;
//
//import java.util.Arrays;
//
//public class MyLinkedList<T> {
//	T data;
//	T pHead;
//	T pNext;
//	T pNode;
//	int size;
//
//	MyLinkedList(){
//		size=0;
//		pHead=null;
//		pNext=null;
//	}
//	
//	void setHead(T pNew) {
//		pHead=pNew;
//	}
//	
//	T getHead() {
//		return pHead;
//	}
//	
//	void setNext(T pNew) {
//		pNext=pNew;
//	}
//	
//	T getNext() {
//		return pNext;
//	}
//	
//	int size() {
//		return size;
//	}
//	
//	//add-맨뒤에 추가
//	void add(T value){
//		T temp;
//		if(size==0) {
//			pHead = value;
//			setNext(pHead);
//		}
//		else if(size==1) {
//			temp = getHead();
//			setNext(value);
//		}
//		else {
//			temp = getHead();
//			while(temp!=null) {
//				
//			}
//		}
//		size++;
//	}
//	
////	void add(int index, T value){
////		
////		size++;
////	}
//
//	
//	//remove-index값에 해당하는 데이터 삭제
//	void remove(int index) {
//		
//	}
//
//	//get-index값에 따라서 가져오기
//	T get(int index) {
//		
//		
//		return pNode;
//	}
//
//	//set-index값에 해당하는 데이터 수정
//	void set(int index, T value) {
//		
//	}
//
//	//toString-전체출력
//	
//	
//	
//	
//}
//
//class Main{
//	public static void main(String[] args) {
//		MyLinkedList<String> list = new MyLinkedList<String>();
//		
//		list.add("MILK");
//		list.add("BREAD");
//		list.add("BUTTER");
//		list.add(1,"APPLE");
//		list.set(2, "GRAPE");
//		list.remove(3);
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//	}
//}