 
public class Logicprob {
	public static int output1;
	public static void main(String[] args){
		usermethod(1234);
		System.out.println(output1);
	}
	public static void usermethod(int input1){
		String s=String.valueOf(input1);
		int len=s.length();
		int sum=0;int ss=0;
		for(int i=0;i<len;i++){
			sum=sum+Integer.parseInt(s.substring(i,i+1));
		
		ss=sum+ss;}
				output1=ss;
	}
}
