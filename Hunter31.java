package guviaji;
import java.util.Scanner;
public class Hunter31 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num of array");
		int k=s.nextInt();
		System.out.println("Enter the element in the array ");
		int a[]=new int[k];
		for(int i=0;i<k;i++){
		a[i]=s.nextInt();
		}
		int b=a[0]*a[1];
		int m=0;
		int n=0;
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				if(a[i]*a[j]>b){
					b=a[i]*a[j];
					m=a[i];
					n=a[j];
				}
			}
		}System.out.print("The max product pair is "+m+","+n+"product is "+b);
		
	}

}
