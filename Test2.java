package T1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
	    String str1;
	    System.out.println("Enter username"); 
	    str1 = myObj.nextLine();
	       
	  
	    String strNew = str1.substring(0, str1.length()-1);
	    System.out.print(strNew);
	    }

  
	}


