package guviaji;

import java.util.Scanner;

public class pro18 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the sum amount");
	int sum=s.nextInt();
	int count=0;
	int s1=sum;
	while(s1>0){
	if(s1>=5){
		s1=s1-5;
		count++;
	}
	if(s1>=3&&s1<5){
	s1=s1-3;	
	count++;
	}if(s1>=1&&s1<3){
		s1=s1-1;
		count++;
	}
	}
		System.out.println(count);
}
}
