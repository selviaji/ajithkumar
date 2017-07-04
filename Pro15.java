package guviaji;

import java.util.Scanner;

public class Pro15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		System.out.println("Enter the element of array");
		int a[]=new int[n];
		String b[]=new String[n];
		int count=0;
		int max=0;
		int var=0;
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			b[i]=Integer.toBinaryString(a[i]);
		} while(n>0){max=0;
		for(int i=0;i<b.length;i++){count=0;
		
			for(int j=0;j<b[i].length()-1;j++){
				if(b[i].substring(j,j+1).equals("1")){
					count++;
				}
			}if(count>max){
				max=count;
				var=i;		
			}
		}
		System.out.println(a[var]);	
	b[var]="0";
	n--;}
	}
	}


