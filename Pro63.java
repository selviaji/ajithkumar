package guviaji;

import java.util.Scanner;

public class Pro63 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String s1=s.nextLine();
	String s2="";
	for(int i=0;i<s1.length()-1;i++){
		if(!s1.substring(i,i+1).equals("\0")){
			for(int j=0;j<s1.length();j++){
				if(s1.substring(i,i+1).equals(s1.substring(j,j+1))){
					s2=s2+s1.substring(i,i+1);
					s1=s1.replace(s1.charAt(i),'\0');
				}
			}
		}
	}System.out.println("The answer is "+s2);

	}

}
