package guviaji;

import java.util.Scanner;

public class Hunter57 {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the size of array");
     int n=s.nextInt();
     System.out.println("Enter the elment in array");
     int a[]=new int[n];
     int count=0;
     String s1="";
     for(int i=0;i<n;i++){
    	 a[i]=s.nextInt();
     }for(int i=0;i<n;i++){count=0;
    	if(!s1.contains(String.valueOf(a[i]))){
    	 for(int j=0;j<n;j++){
    		 if(a[i]==a[j]){
    			 count++;
    		 }}}if(count==1){
    			 System.out.println("The non repeated element is "+a[i]);
    			 i=n;
    		 }  if(i<n){
    		 s1=s1+String.valueOf(a[i]);}
    	 
     }

	}

}
