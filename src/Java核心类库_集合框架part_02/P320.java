package Java核心类库_集合框架part_02;
//Map案例：给你一个字符串求出该字符串中每个字符出现的次数：

import java.util.Map;
import java.util.TreeMap;

public class P320 {
    public static void main(String[] args) {
        String Str="sdasdqwelkjsdqweqwesdasd";
        //把字符串转换为char数组
        char[] c1=Str.toCharArray();
        Map<Character,Integer> map=new TreeMap<>();
        //Key存储当前字符 Value存储当前字符出现的次数！
        for (char ch : c1) {
            //检验当前Map中是否有当前Key的存在
            if (map.containsKey(ch)) {
                //该Map的Key包含该字符，此时取出Value值递增1，再存放进去！
                Integer old=map.get(ch);
                map.put(ch,old+1);
            }else {
                //当前Map的Key不包含该字符，把该字符存储到Map中，设置Value为1；
                map.put(ch,1);
            }  
        }
        System.out.println(map);
    }
}
