package test_user3;

public class ConstructorTest01 {
    public static void main(String[] args) {
        //创建一个User对象
        //调用User类的构造方法来完成对象的创建
        //以下程序创建了4个对象，只要构造函数调用就会创建对象，并且一定是在“堆内存”当中开辟空间
        User u1 = new User();
        User u2 = new User(10);
        User u3 = new User("zhangsan");
        User u4 = new User(10, "zhangsan");

        //调用带有static的方法
        ConstructorTest01.doSome();
        doSome();

        //调用不带static的方法
        //doOther方法存在于ConstructorTest01类中，所以需要创建ConstructorTest01对象
        //创建ConstructorTest01对象，调用无参数构造方法
        ConstructorTest01 t = new ConstructorTest01();//没有任何构造方法会默认有缺省构造器
        t.doOther();

    }

    public static void doSome() {
        System.out.println("do some!");
    }

    public void doOther() {
        System.out.println("do other!");
    }
}