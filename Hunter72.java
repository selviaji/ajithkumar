package guviaji;

import java.util.Scanner;

public class Hunter72 {
	public static void main(String[] args){
		String s="This is an example for this question";
		String str[]=s.split("\\s");
		for (int i=0;i<str.length;i++){
			if(i%2!=0&&i!=0){
				System.out.print(" "+str[i]);
			}else{
				 String str2=new StringBuffer(str[i]).reverse().toString();
				 System.out.print(" "+str2);
			}
		}
		

			}
		}
	


