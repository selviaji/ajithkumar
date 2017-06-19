package guviaji;

import java.util.Scanner;

public class Subcount60 {
	public static void main(String[] args){
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of element ");
		int n=s.nextInt();
		System.out.print("enter the array");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();}
		System.out.println("the sum pairs in array should be ");
		int k=s.nextInt();
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(Math.abs(a[i]-a[j])==k){
					count++;
				}
			}
		}for(int i=0;i<a.length;i++){
			String temp=String.valueOf(a[i]);
			for(int j=i+1;j<temp.length();j++){
				if(Math.abs(Integer.parseInt(temp.substring(i))-a[j])==k){
					count++;
				}
			}
			
		}
		for(int i=0;i<a.length;i++){
			String temp=String.valueOf(a[i]);
			for(int j=i+1;j<temp.length();j++){
				if(Math.abs(Integer.parseInt(temp.substring(i,i+2))-a[j])==k){
					count++;
				}}}
		
		
		System.out.println(+count);

}
}