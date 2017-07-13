package guviaji;

import java.util.Scanner;

public class Pro53 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the  String");
	String str=s.nextLine();
	int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	for(int i=0;i<str.length();i++){
		for(int j=0;j<27;j++){
			if(str.charAt(i)==97+j){
				a[j]++;
			}
		}
	}int k=0;
	int count=0;
	while(a[k]!=0){
		count++;
		k++;
	}if(count==26){
		System.out.println("The given string is Pangram");
	}else{
		System.out.println("The given string is Not Pangram");
	}
	

	}

}
