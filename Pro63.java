package guviaji;

import java.util.Scanner;

public class Pro63 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String s1=s.nextLine();
	String s2="";
	int count=0;
	int n=0;
	for(int i=0;i<s1.length()-1;i++){
		if(!s1.substring(i,i+1).equals("\0")){
			for(int j=i+1;j<s1.length();j++){
				if(s1.substring(i,i+1).equals(s1.substring(j,j+1))){
					s2=s2+s1.substring(i,i+1);
					s1=s1.replace(s1.charAt(i),'\0');
					
				}
			}
		}}System.out.print("The answer is ");
	for(int i=0;i<s2.length();i++){
		if(!s2.substring(i,i+1).equals("\0")){
	System.out.print(s2.substring(i,i+1));
	count++;
		}}System.out.print(" which length is "+count);
	}

}
