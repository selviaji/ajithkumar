package guviaji;

import java.util.Scanner;

public class Hunter35 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		if(str.length()%2!=0){
			System.out.println("Not Double String");
		}else{
			if(str.substring(0,str.length()/2).equals(str.substring(str.length()/2))){
				System.out.println("Double String");
			}else{
				System.out.println("Not Double String");
			}
		}

	}

}
