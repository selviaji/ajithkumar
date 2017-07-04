package guviaji;

import java.util.Scanner;

public class Hunter99 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Input ");
	int n=s.nextInt();
	for(int i=11;i<100;i++){
		if((i%2!=0&&i%3!=0&&i%5!=0)||i==2||i==3||i==5){
			for(int j=11;j<100;j++){
				if((j%2!=0&&j%3!=0&&j%5!=0)||j==2||j==3||j==5){
					if((i+j)==n){
						System.out.println("The input is "+n+". The two prime num are "+i+","+j);
						j=100;
						i=100;
					}
				}
			}
		}
	}

	}

}
