package guviaji;

import java.util.Scanner;

public class Hunter50 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the int values ");
	int input1=s.nextInt();
	int n1=input1;
	int input2=s.nextInt();
	int n2=input2;
	int q=0;
	if(input1>input2){
		while(input1>=input2){
			input1=input1-input2;
			q++;
			}
	}
	else{
		while(input2>=input1){
			input2=input2-input1;
			q++;
			}
	}if(q<n1&&q<n2){
	System.out.println("q="+q);
	}else{
		if(n1>n2){
			System.out.println("input1="+n1);
			
		}else{
			System.out.println("input2="+n2);
			
		}
	}
}
}
