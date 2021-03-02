package weekone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	String User;
	Integer available_money;

	protected main() {

	}

	protected main(Integer available_money) {
		super();
		this.available_money = available_money;

	}

	protected main(String user) {
		super();
		User = user;
	}

	protected static void mainpage(String User)  {

		// Integer choice;
		Scanner sc = new Scanner(System.in);
		// Transaction trans=new Transaction();

		Deposit dp = new Deposit();
		Transfer tr = new Transfer(User);
		Avilablebalance ab = new Avilablebalance(User);
		Pswdreset ps = new Pswdreset();
		System.out.println("");
		System.out.println("Hello " + User + " Welcome to Online Banking");
		int choice = 0;
		do {
			// Integer a= d.available_money;
			// System.out.println(a);
			
			System.out.println("What would you like to do?");

			System.out.println("  1) Withdraw");
			System.out.println("  2) Self-Deposite");
			System.out.println("  3) Transfer");
			System.out.println("  4) change password");
			System.out.println("  5) Avilable balance");
			// System.out.println(" 6) Show account transaction history");
			System.out.println();

			System.out.print("Enter choice: ");
			try {
				choice = sc.nextInt();
			}

			catch (Exception e) {
				System.out.println("");
				System.out.println("Please enter the number betwee 1-5");
				main.mainpage(User);
			}
			if (choice < 1 || choice > 5) {

				System.out.println("Invalid choice. Please choose 1-5.");
			}

		} while (choice < 1 || choice > 5);

// process the choice

		switch (choice) {
		case 1:
			Withdraw.withd(Data.available_money, User);
			break;
		case 2:
			dp.dept(Data.available_money, User);
			break;
		case 3:
			tr.Trans();
			break;
		case 4:
			ps.psw();
			break;
		case 5:
			ab.avl(Data.available_money);
			break;
		}

		/**
		 * case 6: trans.trans(); break;
		 **/

	}
}