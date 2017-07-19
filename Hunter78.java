package guviaji;

import java.util.LinkedList;
import java.util.Scanner;

public class Hunter78 {

	public static void main(String[] args) {
	LinkedList<Integer> a=new LinkedList<Integer>();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter size of list");
    int n=s.nextInt();
    System.out.println("Enter the list element");
    for(int i=0;i<n;i++){
    	a.add(s.nextInt());
    	 }	System.out.println(a.get(n/2));
    }

}
