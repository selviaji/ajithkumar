package guviaji;

public class Pro25 {

	public static void main(String[] args) {
	int k=3;
	String s="";
	String s1="";
	String s2="";
	String s4="";
	String s3="";
	for(int i=0;i<Math.pow(2,k);i++){
		String j=Integer.toBinaryString(i);
		int count=Integer.bitCount(i);
		if(j.equals("0")||j.equals("1")){
			s=s+"00"+j+",";
			}if(count==1&&j.length()==k){
				s4=s4+j+",";
			}
		if(count==2&&j.length()!=k){
			s1=s1+"0"+j+",";
		}
		if(count==2&&j.length()==k){
			s2=s2+j+",";
		}if(count==3){
			s1=s1+j;
		}
			}
			System.out.println(s+s4+s2+s1);

	}

}
