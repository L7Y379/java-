public class VarTest02{
	static int k =5;
	static int m = 55;
	
	public static void main(String[] args){
		int i;//并没有初始化，在赋值过后初始化
		i = 100;
		System.out.println(i);
		i = 200;
		System.out.println(i);
		System.out.println(k);//可以访问
		int m = 50;
		System.out.println(m);//就近访问k=50
		for(int a=0;a<10;a++){
			
		}
		//出了大括号就不记得
		//System.out.println(i);//无法访问a变量，循环过后a变量空间释放
	}
	public static void dosome(){
		//System.out.println(i);//无法编译，错误
		System.out.println(k);//可以编译，但是没有输出
	}
}