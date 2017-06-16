import java.util.Scanner;

public class Differecence {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=s.nextInt();
		int max=0;
		int b=0;
		int[] diff=new int[n-1];
		int[] array=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++){
			array[i]=s.nextInt();
		}
		for(int i=0;i<n-1;i++){
			
				diff[i]=Math.abs(array[i]-array[i+1]);
				if(diff[i]>b){
					 max=i;
					b=diff[i];
				}
			}
		System.out.println("The output is "+max);
			
		}
		
	}
