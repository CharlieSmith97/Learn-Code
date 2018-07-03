package Java核心类库_集合框架part_01;

import java.util.Vector;
import java.util.logging.Logger;
//演示Vector类中的方法

public class P293 {

    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.addElement("123");
        v.addElement(Integer.valueOf(123));//手动装箱
        System.out.println(v);
        //构造一个初始化为指定字符串内容的字符串构建器。  
        StringBuilder sb = new StringBuilder("ABC");
        v.addElement(sb);//直接将StringBuilder构建的字符串对象传入到Vector对象v中！
        System.out.println(v);
        sb.append("SeeMyGo");
        System.out.println(v);

    }
}
