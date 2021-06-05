package animal;

public class Cat extends Animal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("我好饿 啊，我想吃大鱼。。。。。");
    }

//    @Override
//    public void sleep() {
//        super.sleep();
//        System.out.println("我要我的铲屎官 抱着我睡觉了，哈哈哈");
//    }
}
