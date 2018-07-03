package Java核心类库_IO_part_02;
//字节数组流/内存流 

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import java.io.IOException;

public class P354 {
    public static void main(String[] args) throws IOException {
        //字节数组输出流
        ByteOutputStream Bos = new ByteOutputStream(64);
        Bos.write("ABCDE".getBytes());
        //使用临时存储的数据
        byte[] bt=Bos.toByteArray();
        
        //字节数组输入流：内存----->程序
        ByteInputStream Bis=new ByteInputStream();
        byte[] be=new byte[5];
        int len=-1;
        while((len=Bis.read(be))!=-1){
            System.out.println(new String(be,0,len));
        }
    }
}
