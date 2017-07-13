package guviaji;

public class Hunter115 {
public static void main(String[] args){
	String a="Abi";
	String b="Bhuvana";
	int c=1;
	String d="";
	if(a.length()<b.length()){
		for(int i=a.length();i<b.length();i++){
			a=a+String.valueOf(c);
			c++;
		}}else{
			for(int i=b.length();i<a.length();i++){
				b=b+c;
				c++;
			}
		}
	for(int i=0;i<b.length();i++){
			d=d+a.substring(i,i+1)+b.charAt(i);
	}System.out.println(d);
	}
}

