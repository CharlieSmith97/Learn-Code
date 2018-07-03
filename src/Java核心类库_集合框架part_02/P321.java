package Java核心类库_集合框架part_02;

/**
 * List和Map的综合运用 案例：菱形语法
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class P321 {

    public static void main(String[] args) {
        //使用Set集合存储学生的名称
        Set<String> s1 = new HashSet<>();
        s1.add("小明");
        s1.add("小红");
        s1.add("小李");
        s1.add("Amy");
        s1.add("Aj");
        s1.add("小猫");

        Set<String> s2 = new HashSet<>();
        s2.add("西门");
        s2.add("独孤");
        s2.add("铁血");
        //创建学院A，创建学院B
        Map<String, Set<String>> m1 = new HashMap<>();
        m1.put("基础班", s1);
        m1.put("大神班", s2);
        Map<String, Set<String>> m2 = new HashMap<>();
        m2.put("基础班", s1);
        m2.put("大神班", s2);

        //使用List存储来自两个学院的学生名单信息
        List<Map<String, Set<String>>> Li = new ArrayList<>();
        Li.add(m1);
        Li.add(m2);
        System.out.println(Li);
    }
}
        /**
         * 1.采用菱形语法 2.对一些数据进行整合处理 是数据能够客观规律的显示出来
         */
