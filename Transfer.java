package weekone;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Transfer {
	static Data d=new Data();
	protected static String User;
	 protected Transfer(String user) {
		super();
		User = user;
	}
	protected static void Trans() {
		 Long accountnumber = null;
		 
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter 12 Digit Bank Number");
		 try {
		  accountnumber=s.nextLong();
		 }
		 catch(InputMismatchException e) {
			 System.out.println("Please Enter in number format");
			 Transfer.Trans();
		 }
		 
		 String ac_match =accountnumber.toString();
		  Boolean matchacc =Pattern.matches("[0-9]{12}", ac_match);
		  if(matchacc) {
			  System.out.println("Enter Ifsc Code");
				String ifsc=s.next();
				Boolean matchaifsc =Pattern.matches("\\w+", ifsc);
				if(matchaifsc) {
					try {
						 System.out.println(">>>>>Processing<<<<<");
					Thread.sleep(5000);
					}
					catch(Exception e){
						 Thread.currentThread().interrupt(); 
						
					}
					System.out.println("Sucessfully Done.");
					d.mainreturn(User);
				}
				else {
					
					System.out.println("	Wrong Ifsc");
					 Transfer.Trans();
				}
		  }
				else {
					System.out.println("	Wrong Account Number");
					 Transfer.Trans();
				}
		        }
		 
		  
		
	}



