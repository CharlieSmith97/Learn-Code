package Java高级进阶;
//获取类中的构造器 getConstructor

import java.lang.reflect.Constructor;

public class P390 {
    public static void main(String[] args) throws NoSuchMethodException {
    //getAll();
      getOne();
    }
    
    //定义一个获取构造器的方法
    private static void getAll() {
        //1.获取构造器所在类的字节码对象
        Class<user> clz=user.class;
        //2.获取clz中所有的构造器  public修饰的
        Constructor<?>[] cs = clz.getConstructors();
        System.out.println("总共"+cs.length+"个构造器！");
        for (Constructor<?> c : cs) {
            System.out.println(c);
        }
        System.out.println("--------------------------");
        //3.获取所有的构造器 无访问权限无关
        cs= clz.getDeclaredConstructors();
        System.out.println("总共"+cs.length+"个构造器！");
        for (Constructor<?> c : cs) {
            System.out.println(c);
        }
  
    }
//方法签名： 方法名称+参数列表
    private static void getOne() throws NoSuchMethodException {
        Class<user> us=user.class;
        //1.获取指定参数列表的构造方法
        Constructor<user> DC = us.getDeclaredConstructor();
        System.out.println(DC);
        //2.获取指定参数列表的构造方法 带有String的构造方法
        DC=us.getDeclaredConstructor(String.class);
        System.out.println(DC);
        //3.获取指定参数列表的构造方法 带有两个参数列表的构造方法
        DC=us.getDeclaredConstructor(String.class,int.class);
        System.out.println(DC);
    }
}
 class user{

    public user() {
    }
    public user(String name) {
            
    }
    private user(String name,int age) {
    }
    
}
 /**
  * 注意：没有加Declared的只能获取public的公共权限的
  * 加了Declared的就可以不用担心权限不同，获取不同权限的构造器！
  */