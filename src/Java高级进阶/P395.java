package Java高级进阶;
//反射机制-反射其他相关的API

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class P395 {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //获取本类的字节码对象
        Class<P395> cl = P395.class;
        int m = cl.getModifiers();
        //Modifier.toString(m)将获取的int类型的修饰符转换为String类型的修饰符！
        System.out.println(Modifier.toString(m) + "=" + m);
        /*
         修饰符由Java虚拟机的常数为public ， protected ， private ， final ， static ， abstract和interface ;
        应使用Modifier类的方法进行解码。 
         */
 /*
        	Class类中：
	 int getModifiers（） 获得修饰符
	 String getName（） 返回类的全限定名称
	 package getPackage（） 获得该类的包
	 String getSimpleName（） 获得类的简单名字
	 Class getSuperClass 获取类的父类
	 boolean isArray 判断该Class实例是否为数组
	 boolean isEnum 判断该Class是否为枚举类型
	constructor.Method.Filed的信息：
         */
        System.out.println("全限定名称获取：" + cl.getName());
        System.out.println("该类的包：" + cl.getPackage());
        System.out.println("类的简单名称:" + cl.getSimpleName());
        System.out.println("获取类的父类：" + cl.getSuperclass());
        System.out.println("--------------华丽丽分割线！--------------");
        System.out.println("该类是否为数组？");
        if (cl.isArray()) {
            System.out.println("该类是否为数组！");
        } else {
            System.out.println("该类不是数组！");
        }
        System.out.println("--------------华丽丽分割线！--------------");
        System.out.println("该类是否为枚举类型？");
        if (cl.isEnum()) {
            System.out.println("该类为枚举类型！");
        }else{
            System.out.println("该类不是枚举类型！");
        }
        /*
        Constructor<gender> Cs=gender.class.getDeclaredConstructor();
        Cs.setAccessible(true);
        Cs.newInstance();
        */
        System.out.println("测试枚举类型里面的类型是什么："+gender.A.getClass());
    }
}
//声明一个枚举类型
enum gender{
    A,B,C,D,E,F,G;
}