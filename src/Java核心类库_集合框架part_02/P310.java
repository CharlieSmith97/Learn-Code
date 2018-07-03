package Java核心类库_集合框架part_02;

import java.util.LinkedHashSet;
import java.util.Set;

/*
   使用哈希表和链表算法：保证元素先后添加顺序的同时，不允许元素重复！ 
   LinkedHashSet类 相对于HashSet来讲的话性能没那么高，但是主要还是利用了链表的特性来维护元素的位置！
*/
public class P310 {
    public static void main(String[] args) {
        Set<String> s1=new LinkedHashSet<>();
        s1.add("A");
        s1.add("C");
        s1.add("D");
        s1.add("V");
        s1.add("1");
        s1.add("2");
        System.out.println(s1);
    }
}
