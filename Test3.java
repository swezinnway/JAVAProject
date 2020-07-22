package T1;

import java.util.Scanner;

public class Test3 {
	 static String swap(String str1, int i, int j) 
	    { 
	        StringBuilder sb = new StringBuilder(str1); 
	        sb.setCharAt(i, str1.charAt(j)); 
	        sb.setCharAt(j, str1.charAt(i)); 
	        return sb.toString(); 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
	    String str1;
	    System.out.println("Enter username"); 
	    str1 = myObj.nextLine();
	    
	    System.out.println(swap(str1, 0, str1.length() - 1)); 
	    //System.out.println(str1); 
	}

}
