
public class Lp3 {
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
		for(int j=0;j<Integer.parseInt(s.substring(len-1,len));j++){
			sum=sum*Integer.parseInt(s.substring(i,i+1));
			
	}
		
		ss=sum+ss;}
				output1=ss;
	}
}
