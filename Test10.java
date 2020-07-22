package T1;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		  
	    int a1;
	    
	    System.out.println("Enter your number"); 
	    a1 = myObj.nextInt(); 
	    
     
    int value = 1;
     
    System.out.println("Here is your pattern :");
     
    for (int i = 1; i <= a1; i++) 
    {
        for (int j = 1; j <= i; j++) 
        {
            System.out.print(value+"\t");
             
            value++;
        }
         
        System.out.println();
    }

	}

}
