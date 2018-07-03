package JAVA语言新特性_Java5;
//Java5-自动装箱和拆箱以及缓存设计

import java.util.ArrayList;
import java.util.List;

public class P404 {
    public static void main(String[] args) {
        //自动装箱
        Integer num1=17;
        //自动拆箱
        int num2=num1;
        //缓存设计
        Integer n1=new Integer(17);
        Integer n2=new Integer(17);
        System.out.println(n1==n2);//false new 是对对象的创建 而==是对内存地址的比较 显而易见 已经错了！
        System.out.println("-----------------------------");
        Integer n3=Integer.valueOf(17);
        Integer n4=Integer.valueOf(17);
        /*
        public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
            先在常量当中去查找 找到了的话就直接返回 否则则直接创建一个包装类对象！
        }
        public static Integer valueOf(int i) {
            if (i >= IntegerCache.low && i <= IntegerCache.high){
                return IntegerCache.cache[i + (-IntegerCache.low)];
            }
        return new Integer(i);
            先在常量当中去查找 找到了的话就直接返回 否则则直接创建一个包装类对象！
        }
        */
        System.out.println(n3==n4);//true  没有创建新的包装类对象 同样也没有不同的内存地址
        System.out.println("-----------------------------");
        Integer n5=17;    
        Integer n6=17;
        System.out.println(n5==n6);//true 直接对值的声明
        Integer n7=17;
        Integer n8=17;
        System.out.println(n7.equals(n8));//转换为数据的基本类型在于以比较 比较的是数据的基本类型
        System.out.println(n7.intValue()==n8.intValue());//县把包装类类型转换为int类型 在于以比较！
    }
}
