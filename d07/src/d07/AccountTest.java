package d07;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();

		Scanner input = new Scanner(System.in);

		System.out.println("Input balance");
		int money = input.nextInt();

		account.setBalance(money);
	}
}