package guviaji;

import java.util.LinkedList;
import java.util.Scanner;

public class Hunter13 {

	public static void main(String[] args) {
	LinkedList<Character> a=new LinkedList<Character>();
    Scanner s= new Scanner (System.in);
    System.out.println("Total num of characters");
    int n=s.nextInt();
    System.out.println("Enter the characters in list");
    for(int i=0;i<n;i++){
    	a.add(s.next().charAt(0));
    }
    String s1="";
    for(int i=0;i<n;i++){
    	s1=s1+a.get(i);
    }StringBuffer s3=new StringBuffer(s1).reverse();
    String s2=s3.toString();
    if(s2.equals(s1)){
    	System.out.println("Given Singly linkedlist is Palindrome");
    }else{
    	System.out.println("Given Singly linkedlist is Not Palindrome");
    }
	}

}
