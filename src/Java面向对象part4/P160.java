//什么是代码块的简单讲解与介绍   1：局部代码块
package Java面向对象part4;

public class P160 {
    public static void main(String[]args){
        {//局部代码块
        int age=17;
        System.out.println(age); 
        } 
    //System.out.println(age）;报错
        if(true){
        System.out.println("局部代码块！");
        }
    }
}
