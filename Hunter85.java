package guviaji;

import java.util.Scanner;

public class Hunter85 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n number");
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			int n1=i;
			while(n1>0){
				int rem=n1%10;
				if(rem==2){
					count++;
				}n1=n1/10;
			}
		}System.out.print("The count of 2s is "+count);
	}

}
