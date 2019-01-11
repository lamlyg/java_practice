package d10;

import java.util.LinkedList;
import java.util.Queue;

/*
 	Queue : 순서가 있는 데이터들의 집합, FIFO (First In Fisrt Out/선입선출)방식으로 관리
 	
	 	------------------
	 →	  3     2     1		 →
	 	------------------
	들어온순서					나가는순서
	1>2>3					1>2>3
 */

class Msg{
	String command;
	String to;
	
	public Msg(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
	public String getCommand() {return command;}

	public void setCommand(String command) {this.command = command;}

	public String getTo() {return to;}
	
	public void setTo(String to) {this.to = to;}

	@Override
	public String toString() {
		return "Msg [command=" + command + ", to=" + to + "]";
	}
	
	
}

public class QueueTest {
	public static void main(String[] args) {
		Queue<Msg> msgQueue = new LinkedList<Msg>();//인터페이스로 정의되어있음->LinkedList로 되어있음
		//offer : 객체를 큐에 넣음
		msgQueue.offer(new Msg("sendMail","홍길동"));
		msgQueue.offer(new Msg("sendSMS","김자바"));
		msgQueue.offer(new Msg("sendKAKAO","박철수"));
		
		//peak() : 큐에서 객체를 하나 가져옴, 객체를 큐에서 제거는 안함
		//poll() : 큐에서 객체를 하나 가져옴, 객체를 큐에서 제거
		
		//주어진 임무를 출력하기
		//홍길동님께 메일을 보냅니다.
		//김자바님께 문자를 보냅니다.
		//박철수님께 카카오를 보냅니다.
		
		//큐가 빌때까지 계속 순회 -> 계속 꺼냄
		while(!msgQueue.isEmpty()) {
			Msg m = msgQueue.poll();
			switch(m.command) {
			case "sendMail":
				System.out.println(m.to + "님께 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(m.to + "님께 문자를 보냅니다.");
				break;
			case "sendKAKAO":
				System.out.println(m.to + "님께 카카오를 보냅니다.");
				break;
			default:
				break;
			}
//			System.out.println(msgQueue.element().command +" "+ msgQueue.element().to);
//			msgQueue.poll();
		}
	}
}
