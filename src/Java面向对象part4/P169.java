//包装类中的缓存设计（享元模式：Flyweight pattern），本质就是缓存设计
package Java面向对象part4;

public class P169 {
    public static void main(String[]args){
        Integer i1=new Integer(123);//在new的同时就已经创建了新的对象 与此同时比较两个对象比较的是内存地址 显然的出来的结果为false
        Integer i2=new Integer(123);
        System.out.println(i1==i2);
        
        Integer i3=Integer.valueOf(123);//手动装箱：
        Integer i4=Integer.valueOf(123);//取值范围在 [-128—127)之间就获取缓存中的数据   并没有new 开辟新的空间
        System.out.println(i3==i4);//返回一个Integer指定的int值的Integer实例。
        /*
            jdk里面的jdk方法
               public static Integer valueOf(int i) {
           if (i >= IntegerCache.low && i <= IntegerCache.high)   IntegerCache.low or IntegerCache.high  最小值或者最大值
               return IntegerCache.cache[i + (-IntegerCache.low)];
           return new Integer(i);
            }
        */
        Integer i5=123;//底层代码： Integer.valueOf(123);
        Integer i6=123;
        System.out.println(i5==i6);//自动装箱：
        System.out.println("------------------分割线！-------------------");
        Integer i11=new Integer(250);//不在int范围里面[-128-127);   byte，short，long都是在这个方位里面
        Integer i21=new Integer(250);
        System.out.println(i1==i2);
        
        Integer i31=Integer.valueOf(250);
        Integer i41=Integer.valueOf(250);
        System.out.println(i31==i41);

        Integer i51=250;//new Integer.valueOf(250);就算不是250的数值的出来的结果应该为 false
        Integer i61=250;
        System.out.println(i51==i61); 
        System.out.println(i51.equals(i61));//默认比较的是内存地址  需要复写
        /*
        public boolean equals(Object obj) {
            if (obj instanceof Integer) {
                return value == ((Integer)obj).intValue();//拆箱操作将包装类拆箱为基本数据类型  比较的自然是数值 并非是内存地址
            }
            return false;
        }
        */
    }
}
