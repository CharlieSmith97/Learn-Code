package Java核心类库_IO_part_02;
//IO文件字符流完成的文件拷贝

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P346 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\dos编译","Temp_02.txt");
        File f2=new File("D:\\dos编译","Temp_03.txt");
        FileReader Read=new FileReader(f1);
        FileWriter Write=new FileWriter(f2);
        char[] bt = new char[10];
        int len = -1;
        while ((len = Read.read(bt)) != -1) {
            System.out.println(new String(bt, 0, len));
            //数据在bt数组中
            Write.write(bt, 0, len);
        }
        Read.close();
        Write.close();
    }
}
