package guviaji;

import java.util.Scanner;

public class Pro35 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the square box length");
		  int n=s.nextInt();
		  for(int i=0;i<n;i++){
			  System.out.print("* ");
			
			
		  }System.out.println("");
			  for(int j=0;j<n-2;j++){
				  System.out.print("*");
				  for(int k=0;k<((n-2)*2)+1;k++){
					  System.out.print(" ");
				  }System.out.println("*");
			  }
			  for(int i=0;i<n;i++){
				  System.out.print("* ");

			  }
		  
		  
		  
		  
		  
		  
		  
	}
}

