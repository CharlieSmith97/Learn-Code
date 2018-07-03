//基本数据类型的传递
package 方法参数的值传递机制;

public class Demo1 {
    public static void main(String[]args){
         int x=10;
         System.out.println("main方法之前，X的值为："+x);
          change(x);
          System.out.println("main方法之后，X的值为："+x);
    }//同类当中 方法被主方法调用要在静态的条件下才能调用 
    public static void change(int x){
        System.out.println("change方法之前，X="+x);
        x=50;
        System.out.println("change方法之后，X="+x);
    }
}
