////什么是代码块的简单讲解与介绍  3：静态代码块（用Static修饰的初始化代码块）
package Java面向对象part4;

public class P160_2 {
    static {
         System.out.println("静态代码块！");       
    }//不加static为对象，加了static为类（与对象没关系，应为可以全局调用）会先于main方法的运行而运行！
     P160_2(){
         System.out.println("初始化代码块！");
     }
    public static void main(String[]args){
        System.out.println("进入main方法！");
        //创建三个匿名对象 P160_2
        new P160_2();
        new P160_2();
        new P160_2();
    }
}
