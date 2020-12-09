package abstract_test;

/* 文件名 : Salary.java */
public class Salary extends Employee
{
    private double salary; // Annual salary
    //        继承抽象方法的子类必须重写该方法。否则，该子类也必须声明为抽象类。最终，必须有子类实现该抽象方法，否则，从最初的父类到最终的子类都不能用来实例化对象。
    public double computePay()
    {
        System.out.println("Computing salary pay for ");
        return salary/52;
    }

    //其余代码
}

