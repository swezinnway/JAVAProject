package T1;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		   // String str1;
		   // String str2;
		    int a1;
		    
		    System.out.println("Enter Factorial number"); 
		    a1 = myObj.nextInt(); 
		    
		    for(int i=1;i<=12;i++) {
		    	System.out.println(a1+"*"+i+"="+a1*i);
		    }
	}

}
