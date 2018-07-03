package Java高级进阶;
//Class类和Class实例

public class P388 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws ClassNotFoundException {
     //需求：获取java.util.Date类的字节码对象
     //方式1： 使用Class属性   
        Class<java.util.Date> cles1=java.util.Date.class;
     //方式2：  通过对象的getClass方法类获取，getClass是Object中的方法 
     java.util.Date date=new java.util.Date();
        Class<?> cles2=date.getClass();
    //方式3：通过Class类中的静态方法 public static 类<?> forName(String className) throws ClassNotFoundException
        Class<?> cles3=Class.forName("java.util.Date");
        System.out.println(cles1);
        System.out.println(cles2);
        System.out.println(cles3);
    }
}
