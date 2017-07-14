package guviaji;

import java.util.Scanner;

public class Hunter8 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array ");
	int n=s.nextInt();
	System.out.println("Enter the element in the array ");
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}for(int i=0;i<n-1;i++){
		for(int j=1+i;j<n;j++){
			for(int k=0;k<n;k++){
				if(a[i]+a[j]==a[k]){
					System.out.println(+a[i]+"+"+a[j]+"="+a[k]);
				}
			}
		}
	}
}
}
