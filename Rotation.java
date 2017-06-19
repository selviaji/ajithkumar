package guviaji;

import java.util.Scanner;

public class Rotation {
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the number of element ");
	int n=s.nextInt();
	System.out.print("enter the array");
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
		
	}System.out.print("Enter the d element");
	int d=s.nextInt();
	int m=0;
	for(int i=0;i<n;i++){
		if(a[i]==d){
			 m=i;
		}
	}for(int i=m+1;i<n;i++){
		System.out.print(+a[i]);
	}for(int i=0;i<=m;i++){
		System.out.print(+a[i]);
	}

}
}