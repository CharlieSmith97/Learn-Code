//什么是代码块的简单讲解与介绍   2：初始化代码块
package Java面向对象part4;

public class P160_1 {
    {//初始化代码块！ 直接定义在类中并非在主（main）方法中
        System.out.println("This is初始化代码块！");
    }

    public P160_1(){
        System.out.println("This is 构造器！");
    }
    
    public static void main(String[]args){
        System.out.println("进入main方法！");
        //之后创建三个匿名对象（没有明确指明对象的对象创建）
        new P160_1();
        new P160_1();
        new P160_1();
    }
}
