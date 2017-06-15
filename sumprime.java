import java.util.Scanner;

public class Sumpali {
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;
	while(n>0){
		n=n%10;
		sum=sum+n;
	}int a=0;int b=sum;int rem;
	while(b>0){
		rem=b%10;
		a=a*10+rem;
		b=b/10;
	}
if(sum==a){
	System.out.println("The sum of given number is palindrome");
}else{
	System.out.println("The sum of given number is Not palindrome");
	
}
}}
