package guviaji;

import java.util.Scanner;

public class Hunter3 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the element in a array ");
	int a[]=new int[5];
	for(int i=0;i<5;i++){
		a[i]=s.nextInt();	
		}
	for(int j=0;j<5;j++){
		if(j==a[j]){
			System.out.print("index of "+j+" equal to "+a[j]);
			j=5;
		}
	}
}
}
