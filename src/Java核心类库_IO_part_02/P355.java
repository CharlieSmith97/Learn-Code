package Java核心类库_IO_part_02;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

//字符数组内存流
public class P355 {
    public static void main(String[] args) throws IOException {
        //字符内存流
        //设定字符数组内存输入流！
        CharArrayWriter wri=new CharArrayWriter();
        wri.write("青丝若为霜！");
        //创建临时数组存放数据
        char [] data=wri.toCharArray();
        //设定字符数组内存输出流！
        CharArrayReader car=new CharArrayReader(data);
        for (int i = 0; i < 6; i++) {
            System.out.println((char)car.read());
        }
    }
}
