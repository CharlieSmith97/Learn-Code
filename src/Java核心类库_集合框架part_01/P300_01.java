package Java核心类库_集合框架part_01;
//java版本在1.2（集合框架出现）之前的迭代器补充说明

import java.util.Enumeration;
import java.util.Vector;

public class P300_01 {

    public static void main(String[] args) {
        Vector ec = new Vector();
        ec.add("A");
        ec.add("B");
        ec.add("C");
        ec.add("D");
        Enumeration en = ec.elements();//返回此向量的组件的枚举。 Enumeration类型
        if (en.hasMoreElements()) {
            for (int index = 0; index < ec.size(); index++) {
                System.out.println(en.nextElement());
            }
        }
        /*
        or
        
        While(ec.hsaMoreElements()){
           Object e=ec.nextElement();
           sout(e);
        }
        */
    }
    /*
    方法1：boolean hasMoreElements() 
    测试此枚举是否包含更多元素。  
    方法2：E nextElement() 
    如果此枚举对象至少有一个要提供的元素，则返回此枚举的下一个元素。
    该枚举对象如果至少有一个需要提供的元素那么就会得到or返回一个下一个迭代的元素！
     */
}
