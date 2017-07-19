package guviaji;

import java.util.Scanner;

public class Hunter120 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n="";
		String s2="";
		System.out.println("Enter the string");
		String str=s.nextLine();
		int max=str.length();
		for(int i=0;i<str.length()-1;i++){n="";
			for(int j=i+1;j<str.length();j++){
				n=str.substring(i,j);
				StringBuffer s1=new StringBuffer(n).reverse();
				String n1=s1.toString();
				if(n.equals(n1)&&n.length()>1){
					if(n1.length()<max){
						max=n.length();
						s2=n;
					}
				}
			}
		}System.out.println(s2);

	}

}
