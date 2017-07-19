package guviaji;

public class Hunter120 {
	public static String output1;
	public static void main(String[] args) {
	usermethod("template");
	System.out.println("The smallest palidrome is = "+output1);

	}
	public static void usermethod(String input1){
		StringBuffer s=new StringBuffer(input1).reverse();
		int count=0;
		String n="";
		int max=10;
		int min=10;
		int var1=0;
		int var2=0;
	for(int i=0;i<s.length();i++){count=0;
			for(int j=0;j<s.length();j++){
					if(input1.substring(i,i+1).equalsIgnoreCase(input1.substring(j,j+1))){
						count++;
					}
				}if(count%2==0&&count!=0){
				if(count<max){
					max=count;
					var1=i;
				}
				}else if(count<min){
					min=count;
		           var2=i;
				}
				
			}for(int i=0;i<max;i++){
				n=n+input1.substring(var1,var1+1);
			}for(int i=0;i<min;i++){
				n=n+input1.substring(var2,var2+1);
			}
	output1=n;
			
		
	}

}
