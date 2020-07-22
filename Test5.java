package T1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);
	   // String str1;
	   // String str2;
	    int a1;
	    
	    System.out.println("Enter Factorial number"); 
	    a1 = myObj.nextInt(); 
	    
		 int i,fact=1;  
		  //int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=a1;i++){ 
			  
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+a1+" is: "+fact);    
		 }  
	}


