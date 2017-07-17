package guviaji;

import java.util.Scanner;

public class Pro68 {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the two names");
     String firstname=s.nextLine();
     String secondname=s.nextLine();
     System.out.println("Enter the PIN and N");
     int pin=s.nextInt();
     int N=s.nextInt();
     String Userid="";
     String user="";
     String pin1=String.valueOf(pin);
     if(firstname.length()>secondname.length()){
    	 Userid=firstname.substring(0,1)+secondname+pin1.charAt(N-1)+pin1.substring(0,1);
     }else if(firstname.length()<secondname.length()){
    	 Userid=secondname.substring(0,1)+firstname+pin1.charAt(N-1)+pin1.substring(0,1);
     }else if(firstname.length()==secondname.length()){
    	 for(int i=0;i<firstname.length();i++){
    		 if(firstname.charAt(i)>secondname.charAt(i)){
    			 Userid=firstname.substring(0,1)+secondname+pin1.charAt(N-1)+pin1.substring(0,1);
    		i=firstname.length();
    		 }if(firstname.charAt(i)<secondname.charAt(i)){
    			 Userid=firstname.substring(0,1)+secondname+pin1.charAt(N-1)+pin1.substring(0,1); 
    		i=firstname.length();
    		 }
    	 }
     }
     for(int i=0;i<Userid.length();i++){
    	 char character=Userid.charAt(i);
    	 if(Character.isUpperCase(character)){
    		 user=user+Userid.substring(i,i+1).toLowerCase();
    	 }else{
    		 user=user+Userid.substring(i,i+1).toUpperCase();
    	 }
     }System.out.println("User-id="+user);

	}

}
