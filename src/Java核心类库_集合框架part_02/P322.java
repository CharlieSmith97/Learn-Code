package Java核心类库_集合框架part_02;
//集合工具类：Array

import java.util.Arrays;
import java.util.List;

public class P322 {

    public static void main(String[] args) {
        //把数组转换为List对象
        String[] arr = {"A", "B", "C", "D"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
        //此时康成诗自动装箱 把1看成是Integer对象
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        //此时定义了Integer类型的数组    
        int[] arr2 = {1, 2, 3, 4, 5};
        //直接把数组当成是对象！  
        List<int[]> list2 = Arrays.asList(arr2);
        System.out.println(list2);
    }
}
