package guviaji;

import java.util.Scanner;

public class Hunter129 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String a=s.nextLine();
	int sum=0;
	for(int i=0;i<a.length()-1;i++){
		sum=sum+((a.charAt(i+1))-(a.charAt(i)));
	}sum=sum-a.charAt(0);
System.out.println((char)(sum));
	}

}
