import java.util.Scanner;

public class String12 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string1 ");
		String s1=s.nextLine();
		System.out.println("Enter the string2 ");
		String s2=s.nextLine();
		int a=s1.length();
		int b=s2.length();
		int count=0;
		int p=0;
		for(int i=0;i<a-b;i++){
			if(s1.substring(i,b+i).equals(s2)){
				count++;
				 p=i;
				
			}
		}if(count==1){
			System.out.println("The position is "+p);
		}else{
			System.out.println("-1");
		}
	}

}
