package try_catch;

//文件名称 BankDemo.java

/**
 * 声明自定义异常
 * 在 Java 中你可以自定义异常。编写自己的异常类时需要记住下面的几点。
 * 所有异常都必须是 Throwable 的子类。
 *
 * 如果希望写一个检查性异常类，则需要继承 Exception 类。
 *
 * 如果你想写一个运行时异常类，那么需要继承 RuntimeException 类。
 *
 * 可以像下面这样定义自己的异常类：
 *
 * class MyException extends Exception{
 * }
 * 只继承 Exception 类来创建的异常类是检查性异常类。
 *
 * 下面的 InsufficientFundsException 类是用户定义的异常类，它继承自 Exception。
 *
 * 一个异常类和其它任何类一样，包含有变量和方法。
 */
public class BankDemo
{
    public static void main(String [] args)
    {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $500...");
        c.deposit(500.00);
        try
        {
            System.out.println("\nWithdrawing $100...");
            c.withdraw(100.00);
            System.out.println("\nWithdrawing $600...");
            c.withdraw(600.00);
        }catch(InsufficientFundsException e)
        {
            System.out.println("Sorry, but you are short $"
                    + e.getAmount());
            e.printStackTrace();
        }
    }
}
