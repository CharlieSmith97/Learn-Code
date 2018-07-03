package Java高级进阶;
//使用反射调用方法

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class P393 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.调用无参数的方法
        Class<Person> ps=Person.class;
        Method M=ps.getMethod("Dowork");
        //newInstance 创建一个实例对象 里面闯入的方法和参数列表的话就是指定的一个方法 然后调用invoke方法来运行该方法！
        Method md=ps.getMethod("Dowork",String.class);
        md.invoke(ps.newInstance(),"小宁");
        Method mtd=ps.getDeclaredMethod("SayHello",String.class,int.class);
        mtd.setAccessible(true);
        mtd.invoke(ps.newInstance(),"小李",20);
    }
}

class Person{
    public void Dowork(){
        //打印该类的方法签名
        System.out.println("Java高级进阶.Person.Dowork()");  
    }
    public static void Dowork(String name){
        System.out.println("Java高级进阶.Person.Dowork()"+name);
    }
    private String SayHello(String name,int age){
        System.out.println("Java高级进阶.Person.SayHellow()");
        return name+","+age;
    }
}