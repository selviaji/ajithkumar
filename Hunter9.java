package guviaji;

import java.util.Scanner;

public class Hunter9 {
public static void main(String[] args){int b=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of array ");
	int n=s.nextInt();
	System.out.println("enter the element of array ");
	int a[]=new int[n];
	int var=0;
	int var1=0;
	int max=100;
	int max1=-100;
	int ivar=0;
	int ivar1=0;
	int count=0;
	int count1=0;
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			b=a[j]+a[i];
			if(b>0&&b<max){
				max=b;
				var=i;
				var1=j;
			}else if(b<0&&b>max1){
				max1=b;
				ivar=i;
				ivar1=j;
				
			}
		}
		
	}//System.out.println(+max1+""+ivar+""+ivar1);
	while(max1<0){
		max1++;
		count++;
	}while(max>0){
		max--;
		count1++;
	}//System.out.println(max1);
	if(count<count1){
	System.out.println("the two element are "+a[ivar]+","+a[ivar1]+". sum is "+(a[ivar]+a[ivar1]));
	}else{
	System.out.println("the two element are "+a[var]+","+a[var1]+". sum is "+(a[var]+a[var1]));}
}
}
