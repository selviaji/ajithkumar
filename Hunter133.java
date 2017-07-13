package guviaji;

public class Hunter133 {
public static void main(String[] args){
	String s="hello world";
	String res="";
	for(int i=0;i<s.length();i++){
		if(s.substring(i,i+1).equals(" ")){
			res=s.substring(i,s.length())+" ";
			i=s.length();
		}
	}
	for(int i=0;i<s.length();i++){
		if(s.substring(i,i+1).equals(" ")){
			i=s.length();}else{
			res=res+s.substring(i,i+1);
		}
}System.out.println(res);
}}
