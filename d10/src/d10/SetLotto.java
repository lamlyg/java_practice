package d10;

import java.util.HashSet;
import java.util.Set;

/*
	로또번호 생성기 만들기 (1~45까지의 번호를 6개)
	중복없이! set이용해서
 */

class Lotto{
	Set<Integer> set = new HashSet<Integer>();
	
	public Lotto() {
		int d;
		for(int i =0;i<6;i++) {
			do {
				d = (int)(Math.random()*45)+1;				
			}while(set.contains(d)); //contains : 매개변수로 받은 자료가 set안에 있는지 판별
			set.add(d);
		}
	}

	@Override
	public String toString() {
		return "Lotto [set=" + set + "]";
	}
}

public class SetLotto {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		System.out.println(lotto);
		
//		Set<String> lotto = new HashSet<String>();//기초형은 못씀 -> 참조를 이용해야함
//		Set<String> setlotto = new HashSet<String>();
//
//		while(lotto.size()!=6) {
//			int num = (int)Math.random()*45 + 1;
//			setlotto.add(Integer.toString(num));
//			lotto.addAll(setlotto);
//		}
//		System.out.println(lotto);
	}
}
