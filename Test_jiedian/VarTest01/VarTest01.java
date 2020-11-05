public class VarTest01{
	public static void main(String[] args){
		int i;//并没有初始化，在赋值过后初始化
		i = 100;
		int a,b,c=10;//只给c赋值了10
		System.out.println(i);
		System.out.println(c);
	}
}