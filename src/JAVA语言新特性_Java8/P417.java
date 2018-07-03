package JAVA语言新特性_Java8;

import java.util.Arrays;

public class P417 {
    public static void main(String[] args) {
        new P417().test();
    }
    public void test(){
        Integer[] is=new Integer[]{2,312,31,23,4234,5346,1231};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(is));
        /*
        代码简化前：
        Arrays.sort(is,(x,y)->Integer.compare(x, y));
        lambda中的方法的引入！
        */
        Arrays.sort(is,Integer::compare);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(is));
    }
}
