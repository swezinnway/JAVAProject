package T1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
	    String userName;
	    
	    
	    System.out.println("Enter username"); 
	    userName = myObj.nextLine();   
	       
	    System.out.println("Username is: " + userName); 
	    char c=userName.charAt(userName.length()-1);
	    System.out.println(c+userName );
	}

}
