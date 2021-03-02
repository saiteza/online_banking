package weekone;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Deposit {
	static Data d=new Data();
	static Integer Updated_amount;
	public static void dept(Integer available_money,String User) {
		Integer amounttodeposit=0;
		System.out.println("Welcome to Self Deposite (UPI)");
			 Scanner s = new Scanner(System.in);
			 
			 System.out.println("Please enter the amount you want to Deposit   :");
			try {	
			  amounttodeposit=s.nextInt();
			}
			catch(Exception e) {
				System.out.println("Enter a valid Integer value");
				System.out.println("");
				System.out.println("");
				Deposit.dept(available_money, User);
			}finally {
				
			}
			 if(amounttodeposit>0) {
			 System.out.println("Enter UPI id    :");
			 
			 String dummy=s.next();
			
			 boolean pattern=Pattern.matches("[0-9]{10}@[a-z]{3}",dummy );
			          if(pattern) {
			            System.out.println(" Accept request in Your Upi application  ");
				        System.out.println(" Processing Wait for an While ");
			                try {
			                Thread.sleep(2000);
			                     }
			                catch(Exception e) {
				            Thread.currentThread().interrupt();  
			                  }
			                 System.out.println(" Sucessfully Done");
			             
			                       if(amounttodeposit>0&&amounttodeposit<available_money) {
				                   available_money+=amounttodeposit;
			                        System.out.println("available Amount after Transaction  :₹"+available_money);
			                        Updated_amount=available_money;
			         		       System.out.println("updated amount after"+Updated_amount);
			         		       d.money_update(User,Updated_amount);
			                        d.mainreturn(User);
			                        }
			                   }
			      
			             else {
			            	 System.out.println("");
			            	 System.out.println("");
			                 System.out.println("Wrong Upi address");
			               
			                 System.out.println("UPI should in format of Number@upi");
			                 System.out.println("");
			                 System.out.println("");
			                 Deposit.dept(available_money,User);
	           	             }
			                 }
			 else {
			      System.out.println("Enter the money Greater than zero");
		    	  d.mainreturn(User);
			     }
	}
    }
