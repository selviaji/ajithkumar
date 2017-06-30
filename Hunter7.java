package guviaji;

import java.util.Scanner;

public class Hunter7 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of array ") ;
	int n=s.nextInt();
	System.out.println("Enter the given array ");
	String c[]=new String[n];
	int a[]=new int[n];
	int count=0;
	String b[]=new String[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
		b[i]=String.valueOf(a[i]);
	}
	for(int i=0;i<b.length-1;i++){ count=0;
		for(int j=i+1;j<b.length;j++){
			if(b[i].equals(b[j])){
				b[j]="\0";
				count++;
			}
		}if((count==0&&!b[i].equals("\0"))){
			System.out.print("the non repeated element is "+b[i]);
		}
	}if(!b[b.length-1].equals("\0")){
		System.out.print("the non repeated num is "+b[b.length-1]);
	}
	
}
}
