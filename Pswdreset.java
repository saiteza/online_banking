package weekone;


import java.util.Scanner;

public class Pswdreset {
//Data d=new Data();
	
	protected void psw(){
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter Username");
		String User = s.next();
        System.out.println("enter old password");
        String pwd = s.next();
        Data.password(User, pwd);
	}
}
  
 



 
 /** boolean retval1 = .equals(a);
  if(!retval1) {
	  System.out.println("enter new password");
	   a = s.next();
	   pw=a.toCharArray();
	   Authentication au=new Authentication(pw);
	 System.out.println("password changed");
	 Authentication aa=new Authentication(pp,pw);
	 Validation v=new Validation(pw,pp);

	 v.valid();

	 **/
	// main m2 = new main();
	 //m2.mainpage();
	 //au.
