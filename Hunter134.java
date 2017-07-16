package guviaji;

import java.util.Scanner;

public class Hunter134 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two Integer");
		int a=s.nextInt();
		int b=s.nextInt();
		int count=0;
		for(int i=2;i<a&&i<b;i++){
			if(a%i==0||b%i==0){
				count++;
			}
		}System.out.println((count==0)?"Co-Prime":"Not Co-Prime");

	}

}
