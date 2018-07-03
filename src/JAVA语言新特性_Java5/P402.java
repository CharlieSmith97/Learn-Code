package JAVA语言新特性_Java5;

import java.util.HashSet;
import java.util.Set;

public class P402 {
    public static void main(String[] args) {
       String[] arr={"A","B","C","D"};
        handleArray(arr);
        Set set=new HashSet();
        System.out.println("---------------------");
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        handleIterable(set); 
    }
    //使用foreach操作数组
    public static void handleArray(String[] arr){
        for (String string : arr) {
            System.out.println(string);
        }
    }
    //使用foreach集合（Iterable对象）
    public static void handleIterable(Set set){
        for (Object object : set) {
            System.out.println(object);
        }
    }
}
