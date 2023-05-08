import java.util.Locale;
import java.util.Scanner;

import entities.account;

public class AccountProgram {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial desposit (y/n): ");
		
		char response = sc.next().charAt(0);
		
		
		if (response == 'y') {
			System.out.print("Enter initial desposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new account(number, holder, initialDeposit);
		} else {
			account = new account(number, holder);
		}
		
		
		// print account data
		System.out.println();
		System.out.println("Account data");
		System.out.println(account);
		
		
		// Account depositing
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		// Account Withdraw
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		sc.close();
		
		
	}

}
