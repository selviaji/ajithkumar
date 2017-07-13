package guviaji;

import java.util.Scanner;

public class Hunter62 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Price of 10 days ");
		int a[]=new int [10];
		int max=0;
		int min=1000;
		for(int i=0;i<10;i++){
			a[i]=s.nextInt();
		}for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}if(min>a[i]){
				min=a[i];
			}
		}System.out.println("Max Benefit is "+(max-min)+"thousands");

	}

}
