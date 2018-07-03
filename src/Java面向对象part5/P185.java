    //局部内部类分析
package Java面向对象part5;

public class P185 {
   static String  name="小豆";
    public static void main(String[] args) {
        int age1=17;
        /*
            局部变量 局部内部类访问的局部变量必须使用final修饰
            （Java8中不是 自动隐式加上final 实际存在final）
            原因：如果当前方法不是main方法的话，当前方法调用完毕的话，
            当前方法的栈帧被销毁，方法内部的局部变量就会被全部销毁的
            然后局部内部类是定义在方法中的，而且在方法总会创建局部内部类对象，而局部内部类会去访问局部变量，
            当当前方法被销毁的时候，对象还在堆内存中，依然还持有对局部变量的引用，
            但是方法被销毁的时候，局部变量已经被销毁了。
            此时出现：再堆内存中，一个对象引用着一个不存在的数据。为了避免该问题，
            我们使用final修饰局部变量，从而变成常量永驻内存空间，
        */
        //局部内部类
        class Inner3{
            String  Info="Better Man!";
                public void test1(){
                      System.out.println(Info);//可直接访问外部类的成员变量
                      System.out.println(name);
                      System.out.println(age1);
                }
        }
        new Inner3().test1();
    }
}
        /*
        System.out.println(new Inner3().Info);//创建新的内部类匿名对象来调用Info
        System.out.println(new P185().name);//外部类的成员变量
        System.out.println(age1);

           如果是在该方法中或者该字段那么可以直接调用该字段 修饰符static
            直接调用name info创建对象或者调用内部类来调用自己所具有的方法 
        */
        