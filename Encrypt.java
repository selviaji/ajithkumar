package logic;

public class Encrypt {
public static String output1;
public static void main(String[] args){
	usermethod("java");
	System.out.println(output1);
}
public static  String usermethod(String input){
	String s=input;
	int a[]={97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122};
    int b[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
    s=s.toLowerCase();
    int n=0;
    int n1=0;
    int count=0;
    String s1="";
    String s2="";
    for(int i=0;i<27;i++){
    	if(s.charAt(s.length()-1)==(97+i)){
    		n=b[i];
    		
    	}
    }for(int i=0;i<s.length()-1;i++){
    	for(int j=0;j<27;j++){
    		if(s.charAt(i)==97+j){
    			n1=b[j]-n;
    			if(n1<=0){
    				n1=n1+26;
    			}s1=s1+(char)a[n1-1];
    		}
    	}
    }s1=s1+s.substring(s.length()-1);
    for(int i=0;i<input.length();i++){
    	count=0;
    	for(int j=0;j<26;j++){
    		if(input.charAt(i)==97+j){
    			count++;
    		}
    	}if(count==1){
    		s2=s2+s1.charAt(i);
    	}else{
    		s2=s2+s1.substring(i,i+1).toUpperCase();
    	}
    } output1=s2;
    return output1;
    
}
}
