package Java核心类库_集合框架part_01;
//集合元素的迭代/遍历操作

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P300 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        //方式1：for循环
        for (int index = 0; index < list.size(); index++) {
            Object ele = list.get(index);//去除指定位置的元素
            System.out.println(ele);
        }

        /*
        方式2：可以用foreach遍历这个集合
        for（类型 数组名：实例 Iterable实现类的对象）{
            实例
        }
         */
        System.out.println("--------------------华丽丽的分割线！-------------------");
        for (Object ele : list) {
            System.out.println(ele);
        }

        //方式3：使用迭代器
        System.out.println("--------------------华丽丽的分割线！-------------------");
        Iterator it = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(it.next());
        }
        /*
           if(it.hasNext()){
            Iterator it=list.iterator();
           方式1：
            sout（it.next()）;
            sout（it.next()）;
            sout（it.next()）;
            sout（it.next()）;
            sout（it.next()）;
            sout（it.next()）;
           方式2：
            for(int index=0;index<list.size();i++){
            sout(it.next());    
            }
           方式3：
            While循环控制迭代器!
            Iterator it=list.iterator();
            while(it.hasNext()){
            sout(it.next());
            }
        } 
         */
        //手动迭代的话不能手动越界  就是集合里面有固定的数量但是迭代的次数不能大于他只能小于或者等于！

        //方式4：利用for循环来操作迭代器iterator
        System.out.println("--------------------华丽丽的分割线！-------------------");
        for (Iterator it2 = list.iterator(); it2.hasNext();) {
            System.out.println(it2.next());
        }
    }
}
