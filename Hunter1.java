package guviaji;

import java.util.Scanner;

public class Hunter1 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.print("enter the given array size");
	int n=s.nextInt();
	System.out.print("enter the element in the array ");
	int a[]=new int [n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}System.out.print("The repeated num is ");
	for(int i=0;i<n-1;i++){
		int count=0;
		for(int j=i+1;j<n;j++){
			if(String.valueOf(a[i]).equals(String.valueOf(a[j]))){
				count++;
			}
		}if(count==1){
			System.out.print(" "+a[i]);
		}
	}
	
}
}
