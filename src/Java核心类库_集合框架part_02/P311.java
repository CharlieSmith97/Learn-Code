package Java核心类库_集合框架part_02;

import java.util.TreeSet;

public class P311 {
    public static void main(String[] args) {
        TreeSet A=new TreeSet();
        A.add("A");
        A.add("C");
        A.add("B");
        System.out.println(A);
        System.out.println("-------------------华丽的分割线！-------------------");
        TreeSet<String> S1=new TreeSet<>();
        S1.add("A");
        S1.add("B");
        S1.add("C");
        S1.add("1");
        S1.add("3");
        System.out.println(S1);
    }
}
    /*
       底层是采用了红黑树的算法！对集合中的元素进行排序操作！ sort！ 
     /TreeSet默认会对数组进行排序操作！  如果里面类型不一致的话那么会报错！   
    （必须要保证TreeSet集合中的元素对象数据类型一致！）
    不会记录添加的先后顺序！
    */
