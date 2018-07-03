package Java核心类库_IO_part_02;
//IO转换流 （InputStreamReader-OutputStreamWriter）

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class P353 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, UnsupportedEncodingException, IOException {
        //使用字节流完成文件的拷贝操作
        File f1 = new File("D:\\dos编译", "Temp_02.txt");
        File f2 = new File("D:\\dos编译", "Temp_03.txt");
        FileInputStream in = new FileInputStream(f1);
        FileOutputStream out = new FileOutputStream(f2);
        //进行编码解码操作
        Reader Read = new InputStreamReader(in, "UTF-8");
        Writer Wri = new OutputStreamWriter(out, "UTF-8");
        int len = -1;
        char[] ch = new char[1024];
        while ((len = Read.read(ch)) != -1) {
            Wri.write(ch, 0, len);
        }
        Read.close();
        Wri.close();
        if (f2 == null) {
            System.out.println("对不起没写入数据！");
        } else {
            System.out.println("数据写入成功！");
        }
        //获取当前IDE的编码
        /*
        Properties  P=System.getProperties();
        System.out.println(P);
         */
    }
}
