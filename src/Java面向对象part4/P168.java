//包装类的操作
package Java面向对象part4;

public class P168 {
    public static void main(String[]args){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);//用于表示二进制补码二进制形式的 int值的位数。 
        System.out.println(Integer.TYPE);//得到Integer的原始接口类型
        
        Long num=123L;//自动装箱  这里面的类型是大写的（自动装箱的情况下）
        int i=num.intValue();//Long-int
        byte b=num.byteValue();//Long-byte
        System.out.println(new Boolean(true));//底层只认true字符串其他的都是false   
    }
}
