package guviaji;

import java.util.Scanner;

public class Hunter11 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=s.nextLine();
		String str[]=str1.split("\\s");
		for(int i=str.length-1;i>=0;i--){
			//StringBuffer s1=new StringBuffer(str[i]).reverse();
			//String s2=s1.toString();
			System.out.print(str[i]+" ");
		}
	}

}
