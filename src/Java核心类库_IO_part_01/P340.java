package Java核心类库_IO_part_01;
//IO如何正确关闭资源和处理异常

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.System.out;

public class P340 {

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        try {
            File srcFile = new File("D:\\dos编译", "Temp_01.txt");
            File CopyFile = new File("D:\\dos编译", "Temp_02.txt");
            FileInputStream in = new FileInputStream(srcFile);
            FileOutputStream out = new FileOutputStream(CopyFile);
            byte[] bt = new byte[10];
            int len = -1;
            while ((len = in.read(bt)) != -1) {
                System.out.println(new String(bt, 0, len));
                //数据在bt数组中
                out.write(bt, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test2() {
        //声明资源对象 防止资源对象因为作用域的问题导致的报错！
        InputStream in = null;
        OutputStream out = null;
        /*
            但是因为作用域的问题，可能会导致资源关闭的时候出错！
            所以有必要在外边申请资源！
         */
        try {
            //为了防止出现输入流对象为空做合理化判断！不做合理化判断的时候会出现空指针！
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO输入输出流异常！");
        }
        //让两个操作做分开的try-catch操作 保证程序的健壮性！ 不会因为其中的一个Close的错误导致程序出错！
        try {
            //同理可证！ 为了防止输出流对象为空做合理化判断！
            if (out != null) {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO输入输出流异常！");
        }
    }
}
