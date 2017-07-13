package guviaji;

import java.util.Scanner;

public class Hunter123 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the given string ");
	String a=s.nextLine();
	String b="";
	int count=0;
	for(int i=0;i<a.length()-1;i++){
		count=0;
		for(int j=i+1;j<a.length();j++){
			if(a.substring(i,i+1).equals(a.substring(j,j+1))){
				count++;
			}
		}if(count!=0){
			a=a.replace(a.charAt(i),'\0');
		}
	}b=a;
	System.out.println(b);
}

}
