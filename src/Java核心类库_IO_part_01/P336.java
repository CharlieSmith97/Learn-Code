package Java核心类库_IO_part_01;
//IO文件流概述和系统属性  获取系统中所有的属性

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class P336 {
    public static void main(String[] args) {
        Properties pro=System.getProperties();
        Set<Entry<Object,Object>> entrySet=pro.entrySet();
        for (Entry<Object,Object> entry : entrySet) {
            System.out.println(entry.getKey()+"=="+entry.getValue());
        }
        System.out.println("-------------------------------------------");
        String val=System.getProperty("user.dir");
        //确定当前的系统属性 
        System.out.println(val);
        String val1=System.getProperty("java.version");
        System.out.println(val1);
    }   
}
