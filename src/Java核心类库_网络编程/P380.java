package Java核心类库_网络编程;
//网络编程-编码or解码

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class P380 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String name="热血结霜了吗";
        //对字符串进行编码 UTF-8
        String str=URLEncoder.encode(name,"UTF-8");
        System.out.println(str);
        //利用系统的getProperty
        String str1=System.getProperty("file.encoding");
        System.out.println(str1);
        //对字符串进行解码操作 UTF-8
        String str2=URLDecoder.decode(name,"UTF-8");
        System.out.println(str2);
    }
}
