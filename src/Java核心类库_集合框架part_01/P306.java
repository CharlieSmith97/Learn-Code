package Java核心类库_集合框架part_01;

import java.util.ArrayList;
import java.util.List;

    /*
      泛型的擦除和转换  
    */
public class P306 {
    public static void main(String[] args) {
        //带有Integer类型的泛型
        List<Integer> list1=new ArrayList<>();
        list1.add(123);
        
        //不带泛型的集合
        List list2=null;
        list2=list1;
        list2.add("abc");//此时泛型类型擦除
        System.out.println(list2);
        
        //带有String类型的泛型的集合
        List <String> list3=null;
        list3=list2;
        
        //当在String中取出123的时候 会出现相对应的报错：java.lang.Integer cannot be cast to java.lang.String  
        //因为本身就位Integer类型的数组只能用Integer取出 而并非String类型
        String num=list3.get(0);//堆污染
        
    }
}
