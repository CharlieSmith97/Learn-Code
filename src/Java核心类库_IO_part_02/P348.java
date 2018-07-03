package Java核心类库_IO_part_02;
//IO字符编码和解码

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class P348 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str="星辰大海";
        //编码操作：String---->GBK
        byte[] bb=str.getBytes("GBk");
        System.out.println(Arrays.toString(bb));
        //解码操作：GBK--->String
        //因为服务器是老外写的，所以解码也只能使用外国通用的编码格式
        String s1=new String(bb,"ISO-8859-1");
        System.out.println(s1);
        //对于中文来说出现了乱码
        bb=s1.getBytes("ISO-8859-1");
        System.out.println(Arrays.toString(bb));
        //因为默认是UTF-8 所以解码的时候也只能改成UTF-8
        String s2=new String(bb,"GBK");
        System.out.println(s2);
    }
}
