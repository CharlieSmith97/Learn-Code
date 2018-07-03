package Java核心类库_集合框架part_02;

import java.util.Map;
import java.util.TreeMap;
//Map的实现类

public class P318 {

    public static void main(String[] args) {
        Map<String, Object> m1 = new TreeMap<>();
        m1.put("C","Cvalue");
        m1.put("B","Bvalue");
        m1.put("A","Avalue");
        m1.put("D","Dvalue");
        m1.put("F","Fvalue");
        System.out.println(m1);
    }
}
