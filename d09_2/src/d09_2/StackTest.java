package d09_2;
/*
 	stack : 순서가 있는 데이터 집합을 LIFO(Last In First Out)방식으로 관리하는 자료구조
 */

import java.util.Stack;

class Coin{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Coin(int value) {
		this.value = value;
	}
}

public class StackTest {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		//push : 데이터 넣기
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		
		/*
		 	ㅣ	500	 ㅣ
		 	ㅣ	100	 ㅣ
		 	ㅣ	50	 ㅣ
		 	ㅣ	10	 ㅣ
		 	ㄴㅡㅡㅡㅡㅡㅡ
		 	
		 	500->100->50->10 순으로 꺼내짐
		 */
		
		while(!coinBox.isEmpty()) {
			Coin c = coinBox.pop(); //데이터 꺼내오기
			System.out.println(c.getValue()+"원");
		}
		
	}
}
