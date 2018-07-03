package Java核心类库_集合框架part_02;
//Mapt实现类性能特点分析

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class P319 {

    public static void main(String[] args) throws IOException {
        //是Map的实现类，是HashMap的子类
        Properties p = new Properties();
        //Key和Value存储的类型都是String类型！
        p.setProperty("UserName", "Root");
        p.setProperty("PassWord", "Admin");
        //根据key获取Value的类型
        p.getProperty("UserName");
        System.out.println(p);
        /*
        在获取Keyd的Value的值的时候 需要强转为String类型  但是底层的getProperty就已经在底层就强转为String类型了！
        实际上底层是这样处理的： String val=（String）p.get("UserName");
        当如果调用getProperty方法查找根据Key找到相对应的Value的值为空时！ 可以调用getProperty（Key，Value）； 给对应的Key值设定默认值Value！ 
        就不会让该方法出现null值！
        */
        String val = p.getProperty("UserName");
        System.out.println(val);
        
        //加载资源文件
        InputStream inputStream=null;
        p.load(inputStream);    
    }
}
