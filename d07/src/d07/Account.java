package d07;

import java.util.Scanner;

//getter/setter실습
/*
 	은행계좌 객체인 Account 객체는 잔고(balance)필드를 가지고 있음
 */
public class Account {
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	//필드
	private int count;
	private int balance;//잔고

	Account(){
		count=0;
	}
	
	public void setBalance(int balance) {
		if(count==0&&balance>=MIN_BALANCE&&balance<=MAX_BALANCE) {
			this.balance=balance;
			count++;
		}
		else if(count>0&&balance>=MIN_BALANCE&&balance<=MAX_BALANCE) {
			if(this.balance>=MIN_BALANCE&&this.balance<=MAX_BALANCE) {
				this.balance+=balance;
				count++;
			}
		}
		else if(count==0&&balance<MIN_BALANCE||balance>MAX_BALANCE) {
			System.out.println("Error : balance range -> 0<=balance<=1000000");
		}
		else {
			return;
		}
	}
	public int getBalance() {
		return balance;
	}


}

