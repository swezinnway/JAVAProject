package T1;

import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
		
		
		int arr[]= {10,20,30,40};
		 int sum=0;
		 int avg=0;
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 sum+=arr[i];
		 }
		
		 avg=sum/arr.length;
		 System.out.println("Total number:"+sum);
		    
System.out.println("Average number:"+avg);
Arrays.sort(arr); 

System.out.println("minimum two value:"+arr[0]+","+arr[1]);
System.out.println("Maximun two value:"+arr[arr.length-2]+", "+arr[arr.length-1]);
	}
	

}
