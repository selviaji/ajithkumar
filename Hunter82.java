package guviaji;

import java.util.Scanner;

public class Hunter82 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	     System.out.println("Enter the size of array");
	     int n=s.nextInt();
	     System.out.println("Enter the elment in array");
	     int a[]=new int[n];
	     int max=0;
	     for(int i=0;i<n;i++){
	    	 a[i]=s.nextInt();}
	     String s1="";
	     int b[]=new int[n];
	     for(int i=0;i<n;i++){
	    	 if(!s1.contains(String.valueOf(a[i]))){
	    		 s1=s1+String.valueOf(a[i]);
	    		 b[i]=a[i];
	    	 }
	     }for(int i=0;i<n;i++){
	    	 if(b[i]>max){
	    		 max=b[i];
	    	 }
	     }System.out.println("The max digit is "+max);

	}

}
