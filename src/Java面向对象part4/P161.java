//代码的执行问题  *面试题
/*
    run:
    1）：1     P161类依赖于SubClass3类，所以先把SubClass3类的字节码加载进jvm
    2）：构造SuperClass3  SubClass3是SuperClass的子类  所以会优先于2的存在
    3）：2 非static字段都是在构造器中进行初始化，会优先于构造器中的其他代码
    4）：4
    5）：3
    6）：HelloWord!
    成功构建 (总时间: 0 秒)
*/
package Java面向对象part4;

public class P161 { 
    private static P161 d=new P161();//P161 d=null  静态成员是通过底层的静态代码块做初始化操作的 非静态成员是通过构造器做初始化的
    private SubClass3 t=new SubClass3();//底层处理方式： SubClass3 t=null;
    //静态代码块！ 先要有SubClass3字节码  就要从SubClass3开始运行 
    static{
        //d=new P161();
        System.out.println(3);
    }
    //构造器
    public P161(){
        //t=new SubClass3();所以
        System.out.println(4);
    }
    public static void main(String[]args){    
        System.out.println("HelloWord!");
    }
}
    //父类
    class SuperClass3{
        SuperClass3(){
            System.out.println("构造SuperClass3");
        }
    }
    //子类
    class SubClass3 extends SuperClass3{
        //静态代码块！ 由于mian方法的执行而执行 
        static{
            System.out.println(1);
        }
        public SubClass3(){
            super();//一个隐式的构造方法 所以会先加载SuperClass3（）构造方法！
            System.out.println(2);
        }
    }
