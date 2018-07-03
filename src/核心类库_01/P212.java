//String面试题分析
package 核心类库_01;

public class P212 {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2=new String("ABCD");
        System.out.println("引用地址比较！");
        System.out.println(str1==str2);
        System.out.println("str1与str2的内容比较！");
        System.out.println(str1.equals(str2));
    }
}
