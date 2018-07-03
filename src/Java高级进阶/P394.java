package Java高级进阶;
    //使用反射调用静态方法和数组参数方法
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class P394 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException{
            //1.使用反射调用数组参数（可变参数）
            Class<Employee> clz=Employee.class;
            Method me=clz.getMethod("Dowork",int[].class);
            me.invoke(null,new int[]{1,2,3,4});//YES
            me.invoke(null,new Object[]{new int[]{1,2,3,4,5,6}});//YES
            //2.数组元素类型是引用类型的
            Method md=clz.getMethod("Dowork1",String[].class);
            /*
            需要传入一个Object类型的数组 然后再把自己定义的参数列表按照指定的格式予以赋值
            如果是：
                md.invoke(null,new String[]{"A","B","C","D"});这样来的话会报错！
            */
              md.invoke(null,new String[]{"A","B","C","D"});//Error
              md.invoke(null,new Object[]{new String[]{"A","B","C","D"}});//YES
    }
}

class Employee{
    public static void Dowork(int[] arr){
        System.out.println("Java高级进阶.Employee.Dowork()被调用！");
        System.out.println(Arrays.toString(arr));
    }
    public static void Dowork1(String[] arr){
        System.out.println("Java高级进阶.Employee.Dowork1()被调用！");
        System.out.println(Arrays.toString(arr));
    }
}