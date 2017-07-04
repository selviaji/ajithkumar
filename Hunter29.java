package guviaji;

import java.util.Scanner;

public class Hunter29 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array ");
	int b=s.nextInt();
	System.out.println("Enter the element in the array ");
	int a[]=new int[b];
	for(int i=0;i<b;i++){
		a[i]=s.nextInt();
	}System.out.println("Enter the integer ");
	int n=s.nextInt();
	int count=0;
	int max=0;
	for(int i=0;i<b-(n-1);i++){
		count=a[i];
		for(int j=i+1;j<n+i;j++){
			count=count+a[j];
		}
		if(max<count){
			max=count;
		}}	
	System.out.println("The subarray N integer sum is "+max);
}
}
