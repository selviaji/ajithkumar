package guviaji;

import java.util.Scanner;

public class Hunter130 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the day");
	String day=s.nextLine();
	if(day.equalsIgnoreCase("sun")||day.equalsIgnoreCase("sat")){
		System.out.println(false);
	}else{
		System.out.println(true);
	}
}
}
