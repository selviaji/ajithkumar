package guviaji;

import java.util.Scanner;

public class Hunter75 {
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("The num of size array is ");
	int n=s.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the element array");
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			if(a[i]>a[j]){
				System.out.print("\t"+a[j]);
				break;
			}else
				System.out.print("\t-1");
			break;
		}
	}System.out.print("\t-1");
	}
}
