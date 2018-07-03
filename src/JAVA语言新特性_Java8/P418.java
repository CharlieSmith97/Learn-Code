package JAVA语言新特性_Java8;
//Java8-方法引用

import java.util.Arrays;
import java.util.List;

public class P418 {
    public static void main(String[] args) {
       Integer [] is=new Integer[]{123,4324,435,456,567};
       List<Integer> la=Arrays.asList(123,4324,435,456,567);
       //遍历用方法引用来对List数组做遍历操作！
       la.forEach(System.out::println);
    }
}
