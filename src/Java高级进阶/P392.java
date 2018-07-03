package Java高级进阶;
//使用反射获取类中的方法  原理：类似于构造方法
import java.lang.reflect.Method;
public class P392 {
    public static void main(String[] args) throws NoSuchMethodException {
       getOne();
    }

    private static void getAll() {
        Class<User> ur = User.class;
        //获取User类中所有的方法！ 包括自身以及继承过来的所有的方法！
        Method[] methods = ur.getMethods();
        //因为该Method中还包括了父类的方法！
        System.out.println("数量为：" + methods.length + "个！");
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    //获取自身类的中的所有的方法！
    private static void getSelf() {
        Class<User> ur = User.class;
        //获取User类中所有的方法！
        Method[] MDS = ur.getDeclaredMethods();
        //因为该Method中还包括了父类的方法！
        System.out.println("数量为：" + MDS.length + "个！");
        for (Method method : MDS) {
            System.out.println(method);
        }
    }
    //获取指定的方法
    private static void getOne() throws NoSuchMethodException {
        //获取User的字节码对象
        Class<User> us = User.class;
        Method m = us.getDeclaredMethod("SayHello",String.class,int.class);
        System.out.println(m);
    }
}

class User {
    public void Dowork() {

    }
    public static void Dowork(String name) {

    }
    private void SayHello(String name, int age) {
    }
}
