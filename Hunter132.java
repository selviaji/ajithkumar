package guviaji;

import java.util.Scanner;

public class Hunter132 {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   String a="*";
   String b=" ";
   String c="";
   System.out.println("Enter the input values");
   int n=s.nextInt();
   while(n>0){c="";
	   for(int i=0;i<n;i++){
		   c=c+a;
	   }c=c+b+c;
	   System.out.println(c);
	   n=n-1;
   }

	}

}
