package T1;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
	    String str1;
	    //String str2;
	    
	    System.out.println("Enter String1"); 
	    str1 = myObj.nextLine(); 
	    
	    
	    String strNew = str1.substring(0, str1.length()-2);
	   
	   System.out.print(strNew+str1+strNew);
	}

}
