package guviaji;

import java.util.Scanner;

public class Hunter43 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String a=s.nextLine();
	String b="";
	int count=0;
	int var=1;
	int var1=0;
	int as=48;
	for(int j=0;j<a.length()-1;j++){as=48;count=0;
		for(int i=0;i<11;i++){
			if(a.charAt(j)==as+i){
				var1=j;
				count++;
			}
		}if(count==1){
			for(int k=0;k<11;k++){
		if(a.charAt(var1+1)==48+k){
			count++;
		}}
		}
			if(count==1){
	for(int k=0;k<Integer.parseInt(a.substring(var1,var1+1));k++){
		b=b+a.substring(var1-1,var1);
	}}if(count>1){
		for(int k=0;k<Integer.parseInt(a.substring(var1,var1+2));k++){
			b=b+a.substring(var1-1,var1);
		}
	} 
}System.out.println(b);
}}
