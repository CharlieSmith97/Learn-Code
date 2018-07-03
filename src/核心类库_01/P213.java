
package 核心类库_01;

import java.util.Arrays;

public class P213 {
    public static void main(String[] args) {
        BuildString();//方法私有化只能调用它本身 方法  单一方法是不存在创建的or覆盖的 为了安全性着想定义为private
        getStringInfo();
    }
    private static void BuildString() {
      char [] cr = new char[]{'A','B','C'};
      String str5=new String(cr);//将char数组 转为字符串 
        System.out.println(str5);//打印出字符串  
        System.out.println(str5.toCharArray());//将字符串转为字符串数组
        System.out.println(str5.getBytes());//字符串转为byte数组
        System.out.println(Arrays.toString(str5.getBytes()));//打印里面的字符串
    }
    /**
     * 1.返回字符串长度
     * 2.char charAt(in index)返回指定索引处的插入值
     * 3.int indexOf(String str)返回指定字符串在此字符串中第一次出现出的索引
     * 4.int lastIndexOf(String str)返回指定子字符串在子字符串中最右边出现的索引
     */
    private static void getStringInfo(){
        System.out.println("abcd".length());
        System.out.println("LOVEU".charAt(4));
        System.out.println("ABCDEABCDSAE".indexOf("AB"));
        System.out.println("ABSASDKJQWE".lastIndexOf("K"));
       /*
        * 1.字符串比较：equals
        * 2.不考虑大小写比较字符串 equalsIgnoreCase
        * 3.将次字符串于指定的CharSequence比较 contentEquals(CharSequence cs)
        */
        String E1=new String("CBDA");
        String E2=new String("CBDA");
        String E3=new String("cbda");
        System.out.println(E1==E2);
        System.out.println(E1.equals(E2));
        System.out.println(E1.equalsIgnoreCase(E3));//字符串不考虑大小写，从而进行比较
        System.out.println("-------------------字符转换！-------------------");
        System.out.println("ABCD".toLowerCase());//大转小
        System.out.println("abcd".toUpperCase());//小转大
        /*
        字符串转换操作：
        1.String toUpperCase（）
        2.String toLowerCase（）
         */
       /*
        false
        true
        true
        */
    }
    /**
     * run:
     *  4
     *  U
     *  0
     *  6
     */
}
