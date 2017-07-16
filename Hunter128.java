package guviaji;

public class Hunter128 {
public static void main(String[] args){
	int a[]={1,2,3,4,5,6,7};
	int b[]=new int[a.length];
	int max=0;
	int min=1000;
	int var=0;
	int var1=0;
	for(int j=0;j<a.length;j++){
		max=0;
		min=1000;
	for(int i=0;i<a.length;i++){
		if(a[i]!=0&&j%2==0){
			if(max<a[i]){
				max=a[i];
				var=i;
				
			}}if(a[i]!=0&&j%2!=0){
		if(min>a[i]){
				min=a[i];
				var1=i;
			}}
			}if(j%2==0){
				b[j]=max;
				 a[var]=0;
					
			}else{
				b[j]=min;
				a[var1]=0;
			}
	       }for(int i=0;i<b.length;i++){
		System.out.print(b[i]+",");
	}
}
}
