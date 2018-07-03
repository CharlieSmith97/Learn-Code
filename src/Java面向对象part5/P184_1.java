
package Java面向对象part5;

public class P184_1 {
    public static void main(String[] args) {
        Outter1.Inner in2=new Outter1.Inner();
        in2.test();
    }
}
  class Outter1{
      String  name="Outter1.name";
     static String  name2="name2";//有静态类的时候可以没有对象做调用 外部类的时候只能用对象做访问
      
      //实例内部类
      static class Inner{
          static int age=17;//静态内部类中可以定义静态成员和实例成员
          //String name="Inner.name";
          public void test(){
              System.out.println(name2);
              System.out.println(new Outter1().name);
              System.out.println(Outter1.Inner.age);//4.测试类可以通过完整的类名直接访问静态内部类的静态成员。
          }
      }
  }
    