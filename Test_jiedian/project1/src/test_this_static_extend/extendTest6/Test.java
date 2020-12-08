package test_this_static_extend.extendTest6;
import test_this_static_extend.extendTest4.Cat;
import java.util.Date;
public class Test {
    public static void main(String[] args) {

        //编译报错
        //Cat c=new Cat();

		/*
		com.bjpowernode.javase.test002.Cat c=new com.bjpowernode.javase.test002.Cat();
		*/

        Cat c=new Cat();


        Date d=new Date();
        System.out.println(d);


    }
}
