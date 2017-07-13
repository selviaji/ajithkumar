package guviaji;

import java.util.Scanner;

public class Pro57 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two String ");
		String a=s.nextLine();
		String b=s.nextLine();
		int count=0;
		for(int i=0;i<a.length()-2;i++){
			for(int j=0;j<b.length()-2;j++){
				if(a.substring(i,i+2).equals(b.substring(j,j+2))){
			count++;
				}
			}
		}if(count>0){
			System.out.println("True The part string in a is equal substring in b");
		}else{
		
			System.out.println("False a has not part of substring in b ");
		}

	}

}
