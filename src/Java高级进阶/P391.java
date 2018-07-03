package Java高级进阶;
//使用反射来创建对象 1.获取构造器所在类的字节码对象 2.获取构造器对象来创建对象 

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class P391 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        //用传统的方式创建对象 new person(); new person("小明"); new person("小明","20");
        Class<person> clz=person.class;
        Constructor<person> con1=clz.getConstructor();//利用所要使用的类的字节码对象来获取构造器 里面传参数的话可以根据参数列表来获取不同的构造器
        con1.newInstance();//创建对象
        /*
        T newInstance(Object... initargs) 
        使用此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。 
        */
        Constructor<person> con2=clz.getDeclaredConstructor(String.class);//利用所要使用的类的字节码对象来获取构造器 里面传参数的话可以根据参数列表来获取不同的构造器
        con2.newInstance("小黄");//创建对象
        Constructor<person> con3=clz.getDeclaredConstructor(String.class,int.class);//利用所要使用的类的字节码对象来获取构造器 里面传参数的话可以根据参数列表来获取不同的构造器
        con3.setAccessible(true);
        /*
        将此对象的accessible标志设置为指示的布尔值。 true的值表示反射对象应该在使用时抑制Java语言访问检查。 false的值表示反映的对象应该强制执行Java语言访问检查。
        */
        con3.newInstance("小明",17);//创建对象
        //如果有无参构造气的话就直接可以调用newInstance
        clz.newInstance();
    }
}

class person {
    private int age;
    private String name;
    public person() {
        System.out.println("无参构造！");
    }
    public person(String name) {
        this.name=name;
        System.out.println("构造器:"+this.name);
    }
    private person(String name,int age) {
        this.name=name;
        this.age=age;
        System.out.println("构造器:"+this.name+"\t"+this.age);
    }

}
