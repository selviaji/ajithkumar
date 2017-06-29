package guviaji;

public class Hunter116 {
	public static int output1;
	public static void main(String[] args){
		usermethod(12345);
		System.out.println(output1);
	}
	public static void usermethod(int input1){
		String s=String.valueOf(input1);
		int len=s.length();
		int sum=1;int ss=0;
		ss=Integer.parseInt(s.substring(0,1));
		for(int i=1;i<len;i++){sum=1;
		for(int j=1;j<Integer.parseInt(s.substring(i,i+1 ));j++){
			sum=sum*Integer.parseInt(s.substring(i,i+1));}
		//System.out.println(sum);	
	ss=ss+sum;
		
		}
				output1=ss;
	}
}
