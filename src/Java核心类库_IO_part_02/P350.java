package Java核心类库_IO_part_02;
//字符缓冲流 BufferedInputStream or BufferedOutputStream

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P350 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //字节缓冲输出流
        File f1 = new File("D:\\dos编译", "Temp_02.txt");
        FileOutputStream out = new FileOutputStream(f1, true);
        //把输出流对象包装在缓存区中！  性能好！ 再由缓存区中集中做操作处理！
        BufferedOutputStream bos = new BufferedOutputStream(out);
        bos.write("Hello word!".getBytes());
        bos.close();
        //字节缓冲输入流
        File f2 = new File("D:\\dos编译", "Temp_02.txt");
        FileInputStream in = new FileInputStream(f2);
        BufferedInputStream cos = new BufferedInputStream(in);
        byte[] bt = new byte[1024];
        int len = -1;
        while ((len = cos.read(bt)) != -1) {
            System.out.println(new String(bt, 0, len));

        }
        cos.close();
    }
}
