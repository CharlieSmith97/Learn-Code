//面试题
package Java面向对象part4;

public class P162_3 {
    public static void main(String[]args){
      final  ps p1=new ps();//实例化一个新的对象 开辟一个新的内存地址
        System.out.println(p1.info);
        p1.info="现在的梦想";
        System.out.println(p1.info);
       // p1=new ps(); final修饰的引用类型的变量的地址里面的内容可以改变，但是地址不能改变
    }
}
  class ps{
      public String info="最初的梦想";
  }