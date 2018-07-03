package Java核心类库_IO_part_03;
//字符打印流 PrintWriter

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class P362_01 {

    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("D:\\dos编译", "Temp_02.txt");
        //append - 如果 true ，则字节将被写入文件的末尾而不是开头
        FileOutputStream out = new FileOutputStream(f1, true);
        PrintWriter p1 = new PrintWriter(out);
        p1.append("c");
        p1.print(17);
        p1.print("How are you!");
        p1.flush();//手动刷新
        /*
        因为字符打印流不具有自动刷新的方法 如果启用自动刷新，它只会在调用的println，printf，或format方法来完成，而不是当一个换行符恰好是输出。
        这些方法使用平台自己的行分隔符而不是换行符。 
         */

    }
}
