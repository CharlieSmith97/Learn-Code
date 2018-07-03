package Java核心类库_IO_part_02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class P346_01 {
    public static void main(String[] args){
        text1();
        text2();
    }

    private static void text1() {
        try {
            File f1 = new File("D:\\dos编译", "Temp_02.txt");
            File f2 = new File("D:\\dos编译", "Temp_03.txt");
            FileReader Read = new FileReader(f1);
            FileWriter Write = new FileWriter(f2);
            char[] bt = new char[10];
            int len = -1;
            while ((len = Read.read(bt)) != -1) {
                System.out.println(new String(bt, 0, len));
                //数据在bt数组中
                Write.write(bt, 0, len);
            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }

    private static void text2() {
        Reader Read = null;
        Writer Write = null;
        try {
            if (Read != null) {
                Read.close();
            }
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
        try {
            if (Write != null) {
                Write.close();
            }
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
