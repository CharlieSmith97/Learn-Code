package Java核心类库_集合框架part_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    Set接口和HashSet类
    演示HashSet    
 */
public class P308 {

    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        /*
          s1.add("X");
          s1.add("A");
          s1.add("1");
          s1.add("C");
          s1.add("0");
          System.out.println(s1);//不保证添加的先后顺序 根据每一个对象的HashCode值来比较！  
         */
        s1.add("A");
        s1.add("B");
        s1.add("C");
        Set<String> s2 = new HashSet<>();
        s2.add("1");
        s2.add("2");
        s1.addAll(s2);
        System.out.println(s1);
        /*
        if (s1.contains("A")==true) {
            //只要继承了Iterable接口就能成为 foreach的目标！

        }else{
            System.exit(0);
        }
         */
        for (String Arr : s2) {
            System.out.println(Arr);
        }
        System.out.println("--------------------优美分割线!-------------------");
        Iterator<String> it = s1.iterator();//产生一个迭代器对象
        while(it.hasNext()){
            for (int i = 0; i <s1.size(); i++) {
                System.out.println(it.next());
            }
        }
        System.out.println(s1.remove("A"));
        System.out.println(s1);
        s2.removeAll(s2);
        System.out.println(s2);
    }
}
