package weekone;

import java.util.HashMap;
import java.util.Scanner;

public class Data extends Thread {
	static Integer choice = 0;

	static main m = new main();

	String User;
	static Integer available_money;
	static Integer Updated_amount;

	public Data() {

	}

	public Data(String user) {
		super();
		User = user;
	}

	String Pwd;

	public Data(String user, String pwd) {
		super();
		User = user;
		Pwd = pwd;
	}

	static HashMap<String, Integer> money = new HashMap<String, Integer>();

	static	HashMap<String, String> pass = new HashMap<String, String>();
	main m1 = new main();

	public void run() {
		
		pass.put("User", "Password");
		pass.put("User1", "1111");
		pass.put("sai", "1111");
		pass.put("teja", "1111");
		money.put("User", 500000);
		money.put("User1", 5000);
		money.put("sai", 50000);
		money.put("teja", 50000000);
		//System.out.println("run");

	}

	static Pswdreset p = new Pswdreset();

	public void password() {
		//System.out.println("ssss");
		/***
		 * pass.put("User", "Password"); pass.put("User1", "1111"); pass.put("sai",
		 * "1111"); pass.put("teja", "1111"); money.put("User", 500000);
		 * money.put("User1", 5000); money.put("sai", 50000); money.put("teja",
		 * 50000000);
		 ****/
		Boolean valuepresent = pass.containsKey(User);

		if (valuepresent) {
			Boolean check = Pwd.equals(pass.get(User));
			// System.out.println("password" + check);
			main m = new main(User);
			if (check) {
				Data e = new Data(User);

				e.userid(User);
				main.mainpage(User);

			} else {
				System.out.println("Wrong password");
			}
		} else {
			System.out.println("account does not exist");
		}

	}

	public static void password(String User, String pwd) {
		
		Boolean valuepresent = pass.containsKey(User);
		if (valuepresent) {
			Boolean check = pwd.equals(pass.get(User));
			if (check) {

				Scanner s = new Scanner(System.in);
				System.out.println("Enter New Password");
				pwd = s.next();
				pass.replace(User, pwd);

				System.out.println("password changed");
				System.out.println("your new password" + pass.get(User));
				Data.mainreturn(User);

			} else {
				System.out.println("Wrong password");
				p.psw();
			}
		} else {
			System.out.println("account does not exist");
			p.psw();
		}

	}

	public static void userid(String User) {

		Integer available_money1 = money.get(User);

		available_money = available_money1;

	}

	public void money_update(String User, Integer Updated_amount) {

		money.replace(User, Updated_amount);
		System.out.println(money);
		System.out.println(money.get(User));
		System.out.println("money update");
		money.replace(User, Updated_amount);

	}

	public static void mainreturn(String User) {
		do {

			System.out
					.println("***************************************************************************************");
			Scanner sc = new Scanner(System.in);
			System.out.println("");
			System.out.println("");
			System.out.println("1)main page ");
			System.out.println("2)exit ");

			System.out.println("Enter choice: ");
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Enter valid choice ");
				mainreturn(User);
			}
			if (choice < 1 || choice > 2) {

				System.out.println("Invalid choice. Please choose one or two.");
			}
		} while (choice < 1 || choice > 2);
		switch (choice) {
		case 1:
			m.mainpage(User);
			break;
		case 2:
			System.out.println("Thank you for Banking with us :) ");
			System.exit(0);
			break;
		}

		// System.out.println(available_money1);
		// System.out.println(available_money);
		// int i = available_money.intValue();
//	main n=new main(available_money);
		// System.out.println(money);
		// System.out.println(User);

	}

}
