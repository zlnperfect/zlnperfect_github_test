package employee;

/**
 * 2、定义一个员工employee类，公有方法work()、sleep()。
 * employee类有程序员（Coder），测试（Tester），经理（Manager）三个子类，都重写了work方法。
 * a、使用多态的方式创建三个子类对象（父类类型接受子类对象），调用工作work和sleep方法。
 * b、编写一个method方法能够同时接收Coder、Tester、Manager并且调用work和sleep方法。
 *
 */

public class Employee {
    public void work(){
        System.out.print("要开始工作了");
    }
    public void sleep(){
        System.out.println("午休时间到了，我要开始午休了。");
    }
}
