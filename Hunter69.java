package guviaji;

import java.util.Scanner;

public class Hunter69 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the email address");
		String a=s.nextLine();
		int count=0;
		int count1=0;
		int count2=0;
		String val="";
		if(a.contains("@")){
			for(int i=0;i<a.length();i++){
				if(a.charAt(i)=='@'){
					count++;
					for(int j=i+1;j<i+5;j++){
					if(a.charAt(i+6)=='.'){
						for(int k=0;k<27;k++){
							if(a.charAt(j)==97+k){
								count1++;
							}
						}
					}
					}
				}
				}
		}for(int i=0;i<a.length();i++){
			if(a.charAt(i)=='@'){
					i=a.length();
		}else{
			count2++;
		}

	}
		if(count==1&&count1==4&&count2>=3&&a.substring(a.length()-4).equals(".com")){
		System.out.println("Valid email");
	}else{
		System.out.println("InValid email");
	}

}}
