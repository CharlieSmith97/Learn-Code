package Java核心类库_IO_part_01;
//IO文件拷贝操作-使用文件字节流完成文件拷贝
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P339 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*
            1.创建输出源 
            1.创建写入（输入）源
         */
        File srcFile = new File("D:\\dos编译", "Temp_01.txt");
        File CopyFile = new File("D:\\dos编译", "Temp_02.txt");
        /*
            2.创建输入的管道 (输入流对象)
            2.创建输入的管道 (输出流对象)
         */
        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(CopyFile);
        /*
            3.读取操作
            3.写入操作
         */
        byte[] bt = new byte[10];
        int len = -1;
        while ((len = in.read(bt)) != -1) {
            System.out.println(new String(bt, 0, len));
            //数据在bt数组中
            out.write(bt, 0, len);
        }
        /*
            4.关闭管道（输出流资源）
            4.关闭管道（输入流资源）
         */
        in.close();
        out.close();
    }
}
