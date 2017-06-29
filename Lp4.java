
public class Lp4 {
	public static int output1;
	public static void main(String[] args){
		usermethod(1234);
		System.out.println(output1);
	}
	public static void usermethod(int input1){
		String s=String.valueOf(input1);
		int len=s.length();
		int sum=1;int ss=0;
		for(int i=0;i<len;i++){sum=1;
		if(i!=len-1){
		for(int j=0;j<Integer.parseInt(s.substring(i+1,i+2));j++){
			sum=sum*Integer.parseInt(s.substring(i,i+1));
		}}else{
			for(int j=0;j<Integer.parseInt(s.substring(0,1));j++){
				sum=sum*Integer.parseInt(s.substring(i,i+1));
			}
		}
	
		
		ss=sum+ss;}
				output1=ss;
	}
}
