package guviaji;

import java.util.Scanner;

public class Hunter2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=s.nextInt();
	System.out.println("enter the element in array ");
	int a[]=new int[n];
	int temp=0;
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			if(a[i]<a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}for(int i=0;i<n;i++){
		System.out.print(a[i]);
	}

	}

}
