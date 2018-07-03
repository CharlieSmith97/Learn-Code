//面向对象中的 装箱和拆箱操作
package Java面向对象part4;

public class P167 {
    public static void main(String[]args){
         //装箱操作 把一个基本类型的值转换为对应包装类的对象
        Integer num1=new Integer(17);
         //方式1
        Integer num2=Integer.valueOf(num1);
         //方式2
         //拆箱操作：把包装类的对象，转换为对应的基本类型变量
          int num3=num1.intValue();
          System.out.println(num1);
          System.out.println(num2);
          System.out.println(num3);
          System.out.println("------------------------------------------");
          //自动装箱:  可以直接把一个基本类型值赋给对应的包装类对象
          Integer num4=17;
          //自动拆箱:  前提是在Java5的前提下（版本后）
          Integer num5=num4;
          //底层代码的执行是  Integer integer2= Integer.ValueOf(17);int j=integer2.intValue();
          /*
          在Java的集合框架中，只能存储对象，不能存储基本类型值。
          每次存储到集合中的基本数据都得手动装箱。
          int num5=mun4;
          System.out.println(num4);
          System.out.println(num5);
          */
    }
}
