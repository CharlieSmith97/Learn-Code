package JAVA语言新特性_Java8;
//构造器引用！

import java.util.Arrays;
import java.util.List;

public class P419 {
    public static void main(String[] args) {

    }
    public void test(){
        //构造器方法引用！
        //类名：：new
        List<Integer> l1=Arrays.asList(123,123,124,345,345,567,345,23,4);
        System.out.println(l1.getClass());
    }
}
