
/*
	1.循环结构：
		在程序中，总有一些需要反复的、重复的执行的代码，假设没有循环结构，
		那么这段需要反复执行的代码自然需要进行重复编写。代码无法得到重复
		使用。所以多数编程语言都是支持循环结构的。将来把需要反复执行的代码
		片段放到“循环体”，再联“计数器”，共同控制这段需要反复执行的代码。
	2.基本上所有的编程语言支持的循环包括三种：
		*for循环
		*while循环
		*do...while循环
	3.当前实例主要讲解for循环。for循环的语法结构是什么呢？
		语法结构：
		for(初始化表达式;布尔表达式;更新表达式){
			//需要重复执行的代码片段【循环体：由java语句构成】
		}
    4.for循环的执行过程/执行原理？【非常重要！】【五颗星！】
        4.1.初始化表达式、布尔表达式、更新表达式都不是必须的！【但是里面的两个分号必须要有】
		4.2.初始化表达式最先执行，并且在整个for循环里只执行一次
		4.3.布尔表达式必须是true或false，不能是其他值
		4.4.for执行过程：
		
			1.先执行初始化表达式，并且该表达式只执行一次
			
			2.判断布尔表达式是否为true还是false
			
				2.1-true，执行循环体内的内容
						  执行更新表达式
				重复2，直到布尔表达式为false，循环结束
				
				2.2-false，循环结束
*/

public class ForTest01{
	
	public static void main(String[] args){
		
		//需求：在控制台输出1、2、3...直到10
		System.out.println(1);
		//再将上述代码复制9份，更改输出值。
		
		System.out.println("------------------------");
		
		//利用for循环对其优化
		//for循环可以让代码量变少
		
		//for(int i=1;i<=10;i=i+1){
		//	System.out.println(i);
		//}
		
		
		//for(int i=1;i<=10;i+=1){
		//	System.out.println(i);
		//}
		
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
		//三种写法都可以
		
		//所谓的“死循环”是什么？
		//布尔表达式直接写成true或者结果确定只能是true
		
		//for(;;){
		//	System.out.println("死循环");
		//}
		//这就是一个死循环。
		//让其强制终止，在DOS窗口按“ctrl+c”
		
		
		
		
		
		
		
		
		
		
	}
}




