package guviaji;

import java.util.Scanner;

public class Hunter37 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		StringBuffer s1=new StringBuffer(str.substring(1,str.length())).reverse();
		String s2=s1.toString();
		if(str.substring(1,str.length()).equalsIgnoreCase(s2)){
			System.out.println("charater '"+str.charAt(0)+"' index 0 remove get Palindrome");
		}else{
			for(int i=1;i<str.length();i++){
				String s3=str.substring(0,i)+str.substring(i+1,str.length());
				StringBuffer s4=new StringBuffer(s3).reverse();
				String s5=s4.toString();
				if(s3.equalsIgnoreCase(s5)){
					System.out.println("charater '"+str.charAt(i)+"' index "+i+" remove get Palindrome");
			i=str.length();
				}}
		}

	}

}
