//字符串连接
public class Stringconcat{
	public static void main(String args[]){
		String s1="concat1";
		String s2="concat2";
		System.out.println( "s1 is : " + s1 );
		System.out.println( "s2 is : " + s2 );
		//利用concat函数
		System.out.println( "s1+s2 is : " + s1.concat(s2) );
		

		//直接用+连接
		System.out.println( "s1+s2 is : " + s1+s2 );
	}
}