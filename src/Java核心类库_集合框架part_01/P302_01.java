package Java核心类库_集合框架part_01;
//迭代删除操作！

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P302_01 {

    public static void main(String[] args) {
        List ls = new ArrayList();
        ls.add("Q");
        ls.add("W");
        ls.add("E");
        ls.add("R");
        System.out.println(ls);
        System.out.println("迭代删除之后的结果为：");
        Iterator it = ls.iterator();//创建一个迭代器对象 然后调用迭代器中的remove()方法!
        while (it.hasNext()) {
            Object ele = it.next();//当前对象为迭代对象 数组下标为0！
            //当字符串为 Q的时候 就直接将Q删除掉！
            if ("Q".equals(ele)) {
                it.remove();
            }
        }
        System.out.println(ls);
    }
}

    /*
    for (Iterator iterator = ls.iterator(); iterator.hasNext();) {
    Object ele = iterator.next();
    System.out.println(ele);
    //删除集合中为Q的字符串
    if ("Q".equals(ele)){
    ls.remove(ele);//不能使用集合对象的remove
    }
    }
    Exception in thread "main" java.util.ConcurrentModificationException
     */