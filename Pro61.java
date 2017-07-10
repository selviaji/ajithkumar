package guviaji;

import java.util.Scanner;

public class Pro61 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the two Strings");
	String s1=s.nextLine();
	String s2=s.nextLine();
	int n=0;
	String  s3="";
	for(int i=0;i<s1.length();i++){n=0;
		if(s1.charAt(i)<112){
			n=s1.charAt(i)+10;
			System.out.print((char)n);
		}else {
			n=122-s1.charAt(i);
			n=10-n;
			System.out.print((char)(97+n));
		}
	}for(int i=1;i<s2.length()-1;i++){
		n=0;
	if(s2.charAt(i)<112){
		n=s2.charAt(i)+10;
		s3=s3+(char)n;
	}else {
		n=122-s2.charAt(i);
		n=9-n;
		s3=s3+(char)(97+n);
	}
	}
System.out.print(" "+(s2.charAt(0)+s3+s2.charAt(s2.length()-1)));
	}

}
