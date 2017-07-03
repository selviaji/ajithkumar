package guviaji;

import java.util.Scanner;

public class Hunter10 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a1[]=new int[n];
	for(int i=0;i<n;i++){
		a1[i]=s.nextInt();
	}int n1=s.nextInt();
	int a2[]=new int[n1];
	for(int i=0;i<n1;i++){
		a2[i]=s.nextInt();
	}int count =1;
	for(int i=0;i<n1;i++){
		if(a2[i]==a1[0]){
			for(int j=i+1;j<n1;j++){ int k=1;
				if(a2[j]==a1[k]){
					k++;
					count++;
				}else{
					j=n1;
				}
			}
			
		}
	}if(count==a1.length){
		System.out.println("a1 is subset of a2");
	}else{
		System.out.println("a1 is not subset of a2");
	}
}
}
