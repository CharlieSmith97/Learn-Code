package Java高级进阶;
//8大基本数据类型的Class实例
public class P389 {
    public static void main(String[] args) {
        Class booleanClass=boolean.class;
        Class intClass=int.class;
        
        //Integr.Class和int.class相同吗？
        if (Integer.class==int.class) {
        System.out.println("相同！");
        }else{
        System.out.println("不相等！"); 
        }
        //type 用于返回该包装类 对应基本类 的字节码对象
        if (Integer.TYPE==int.class) {
            System.out.println("相等！");
        }else{
            System.out.println("不相等！");
        }
        System.out.println("------------------------------------");
        int []arr={1,2,3};
        Class getClass=arr.getClass();
        System.out.println(getClass);
    }
}
