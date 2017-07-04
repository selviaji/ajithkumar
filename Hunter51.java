package guviaji;

import java.util.Scanner;

public class Hunter51 {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the two string ");
String s1=s.nextLine();
String s2=s.nextLine();
String s3=String.valueOf(Integer.parseInt(s1)*Integer.parseInt(s2));
System.out.println("The mutliplication of given two string is "+s3);
}
}
