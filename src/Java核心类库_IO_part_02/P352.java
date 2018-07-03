package Java核心类库_IO_part_02;
//IO节点流和缓冲流的性能对比

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P352 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f1 = new File("D:\\dos编译", "Temp_02.txt");
        File f2 = new File("D:\\dos编译", "Temp_03.txt");
        test1(f1, f2);
        test2(f1, f2);
    }
    //字节流文件拷贝性能测试 
    private static void test(File f1, File f2) throws FileNotFoundException, IOException {
        //声明一个时间点函数！
        long begin = System.currentTimeMillis();
        FileInputStream in = new FileInputStream(f1);
        FileOutputStream out = new FileOutputStream(f2,true);
        byte[] bt = new byte[1024];
        int len = -1;
        while ((len = in.read(bt)) != -1) {
            out.write(bt, 0, len);
        }
        in.close();
        out.close();
        //程序运行完成时的时间（性能）
        System.out.println("总共用时为：" + (System.currentTimeMillis() - begin)+"毫秒！");
    }
     //字节缓冲流文件拷贝性能测试 
    private static void test1(File f1, File f2) throws FileNotFoundException, IOException {
        //声明一个时间点函数！
        long begin = System.currentTimeMillis();
        FileInputStream in = new FileInputStream(f1);
        //设定一个字节输入缓冲流
        BufferedInputStream Input=new BufferedInputStream(in);
        FileOutputStream out = new FileOutputStream(f2,true);
        //设定一个字节输出缓冲流
        BufferedOutputStream Output=new BufferedOutputStream(out);
        int len = -1;
        while ((len = Input.read()) != -1) {
            Output.write(len);
        }
        Input.close();
        Output.close();
        //对该程序的运行时间进行比对！
        System.out.println("总共用时为：" + (System.currentTimeMillis() - begin)+"毫秒！");
    }
    
        private static void test2(File f1, File f2) throws FileNotFoundException, IOException {
        //声明一个时间点函数！
        long begin = System.currentTimeMillis();
        FileInputStream in = new FileInputStream(f1);
        //设定一个字节输入缓冲流
        BufferedInputStream Input=new BufferedInputStream(in);
        FileOutputStream out = new FileOutputStream(f2,true);
        //设定一个字节输出缓冲流
        BufferedOutputStream Output=new BufferedOutputStream(out);
        int len = -1;
        //带了缓冲区
        byte[] bt=new byte[1024];
        while ((len = Input.read(bt)) != -1) {
            Output.write(bt,0,len);
        }
        Input.close();
        Output.close();
        //对该程序的运行时间进行比对！
        System.out.println("总共用时为：" + (System.currentTimeMillis() - begin)+"毫秒！");
    }
}
