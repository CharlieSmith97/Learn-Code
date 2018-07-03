    //实例内部类与静态内部类的分析
package Java面向对象part5;
    //演示实例内部类
public class P184 {
    public static void main(String[] args) {
    //创建Inner对象
        Outter OT=new Outter();
        OT.new Inner();
    //通过外部类创建内部类对象
    //其实也可以这样 Outter.Inner in=new Outter().new Inner();
    Outter.Inner in=OT.new Inner();
        System.out.println(in);//打印对象是直接打印他的哈希码值
        in.Tese();
    }
}
//外部类 实例内部类当中都不能加static
class Outter{
    String name="Outter.name";
    public void ooxx(){
        System.out.println(this.new Inner().age);
    }
        //内部类
    public class Inner{
        int age=17;
        String name="Inner.name";
       public void Tese(){
           String name="local.name";
           System.out.println(name);//就近原则调用本作用域的name
           System.out.println(this.name);//调用外部的name Inner.name
           System.out.println(Outter.this.name);//调用最外层的name Outter.name
           /*
           run:
            local.name
            Inner.name
            Outter.name
           */
       }
    }
}