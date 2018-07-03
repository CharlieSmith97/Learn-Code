package JAVA语言新特性_Java5;
  //Java5-新特性：泛型
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class P405 {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<Integer>();
        set.add(1);
        List<Object> st=new ArrayList<Object>();
        st.add("小花");    
        st.add("小红");    
        st.add("小李");
        System.out.println(set);
        System.out.println(st);
        doWork();
        }

    private static void doWork(){
        //创建List<Integer>
        List<Integer> list1=new ArrayList<Integer>();
        list1.add(123);
        //把List<Integer>转换为List
        List list2=list1;
        //把不带泛型的List转换为List<String>
        List<String> list3=list2;
        System.out.println("集合list3的数据为："+list3.get(0));
    }
    /*
        1.导致堆污染的原因：
                1.使用泛型：
                2.使用可变参数：
    */
}
