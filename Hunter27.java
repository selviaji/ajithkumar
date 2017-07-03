package guviaji;

import java.util.Scanner;

public class Hunter27 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string");
	String str=s.nextLine();
	StringBuffer s1=new StringBuffer(str).reverse();
	String s2=s1.toString();
	if(str.length()%2==0&&str.equals(s2)){
		System.out.println("Max substring of not palindrome "+(str.length()-1));
	}else{
		System.out.println("Max substring of not palindrome "+str.length());
	}
	

	}

}
