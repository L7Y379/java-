
/*
	��ʹ�õݹ飬����5�Ľ׳�
	5*4*3*2*1
*/

/*
public class RecursionTest04{
	
	public static void main(String[] args){
		
		int retValue=method(5);
		System.out.println(retValue);
	}
	
	public static int method(int n){
		
		int result=1;
		for(int i=n;i>=1;i--){
			result*=i;
		}
		return result;
	}
	
	
}
*/



public class RecursionTest04{
	public static void main(String[] args){
		int a=10;
		int result=getresult(5);
		System.out.println(result);
	}
	public static int getresult(int n){
		if(n==1){
			return 1;
		}
		return n*getresult(n-1);
	}
}













