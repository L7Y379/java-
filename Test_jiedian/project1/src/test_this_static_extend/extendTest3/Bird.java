package test_this_static_extend.extendTest3;
/**
 * 鸟类
 *
 */
public class Bird extends Animal {
    //子类继承父类，也会移动，进行方法重写
    public void move() {
        System.out.println("鸟儿在飞翔！");
        System.out.println("调用Bird move");
    }

    public void fly() {
        System.out.println("I can fly!");
    }
}
