package weekone;

import java.util.Scanner;

public  class Withdraw {
	protected static Integer Updated_amount;
	protected static Data d=new Data();
	
	protected static String User;
	
	
	protected static int available_money;
	protected Withdraw(Integer available_money) {
		super();
		Withdraw.available_money = available_money;
	}



	protected Withdraw(String user) {
		super();
		User = user;
	}
	
	protected static void withd(Integer available_money,String User){
			
		  Scanner s = new Scanner(System.in);
		  System.out.println("Please enter the amount you want to Withdraw  :");
		  Integer amounttowithdrawn=s.nextInt();
		
		       if((amounttowithdrawn>0&&amounttowithdrawn<available_money)) {
			   available_money-=amounttowithdrawn;
		       System.out.println("available Amount after Transaction  :₹"+available_money);
		       Updated_amount=available_money;
		       System.out.println("updated amount after"+Updated_amount);
		       d.money_update(User,Updated_amount);
		       //System.out.println("Thank you for banking with us ! :)");
		       d.mainreturn(User);
		        }
		
		        else {
		        System.out.println("");
		     	System.out.println("Your account Balance  "+available_money+" But you are trying to with draw"+amounttowithdrawn);
		     	d.mainreturn(User);
		   	   
		       }

      }
}