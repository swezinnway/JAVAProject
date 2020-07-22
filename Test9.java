package T1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		   
		    double a1;
		    
		    System.out.println("Enter your number"); 
		    a1 = myObj.nextDouble(); 
		    
		    DecimalFormat decimalFormat =  new DecimalFormat("000,000"); 
		   
		    System.out.println(decimalFormat.format(a1)); 
	}

}
