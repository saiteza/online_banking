package weekone;
import java.util.*;

public class Authentication extends Thread{
	protected static String User;
	protected static String Pwd;
	
	
	
	public static void main(String[] sai) 
	{
		
		Scanner s = new Scanner(System.in);
		 Data d=new Data();
		  d.start();
		 System.out.println("Online Banking");
		 System.out.println("");
      System.out.println("Enter Username");
      User = s.next();
      System.out.println("Enter Password");
      Pwd = s.next();
    
       Data d1=new Data(User,Pwd);
       
d1.password();
      }
    }



/**
boolean retval1 = Arrays.equals(pw,pp);
main m1=new main(pw,pp);
System.out.println(retval1);
if( !retval1) {
	System.out.println("exit");
}
else {
	
	m1.mainpage();
}
***/
/***
char [] Array2 = null;
for (int counter = 0; counter < a.length(); counter++) {
  try {
    Array2[counter] =a.charAt(counter);
}
  catch(NullPointerException e) {}
  boolean retval3 = Arrays.equals(pw,Array2);
  ***/
/*public Authentication(char[] pw, char[] pp) {
System.out.println("authenticationPassword");
Authentication.pw = pw;
this.pp = pp;
}*/

