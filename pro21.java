package guviaji;

import java.util.Scanner;

public class pro21 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int n=s.nextInt();
		int sum1=0;
		int sum2=0;
		int var=0;
		int a[]=new int [n];
		System.out.println("Enter the element of array ");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}float avg1=1;float avg2=1;
		for(int i=0;i<a.length-1;i++){sum2=0;var=0;
			sum1=sum1+a[i];
			avg1=sum1/(i+1);
			for(int j=i+1;j<a.length;j++){
				sum2=sum2+a[j];
				var++;
			}avg2=sum2/var;
			if(avg1==avg2){
				System.out.println("");
				for(int k=0;k<=i;k++){
					System.out.print(a[k]+",");
				}	System.out.println(" ");
				for(int j=i+1;j<a.length;j++){
					System.out.print(a[j]+",");
				}i=a.length;
			}
		}if(avg1!=avg2){
			System.out.println("Not Possible");
		}

	}

}
