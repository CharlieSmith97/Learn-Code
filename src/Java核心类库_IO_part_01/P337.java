package Java核心类库_IO_part_01;
//演示文件字节输出流

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class P337 {
    public static void main(String[] args)throws IOException {
        //1.创建目标对象，表示把数据保存到哪一个文件
        File val1=new File("D:\\dos编译","Temp_01.txt");
        //2.创建水管（文件字节输出对象）
          FileOutputStream out=new FileOutputStream(val1,true);//FileOutputStream（"需要修改的文件对象",true/false）  boolean append 是否需要添加元素！
        //3.具体的输出操作（往外写操作）
        /*
        void write(byte[] b) 
        将 b.length字节从指定的字节数组写入此输出流。  
        void write(byte[] b, int off, int len) 
        从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。  
        abstract void write(int b) 
        将指定的字节写入此输出流。  
        */
        //添加的数值其实是字符编码集  可以通过比对Ascll码表 来比对添加的元素！
        out.write("其实你很美".getBytes());//可以先想好需要添加什么内容然后通过getbytes()转为 数值然后再把它添加进去就能够变成想要的内容了！
        out.write("66666".getBytes(),0,"66666".length());
        out.write(88);
        //4.关闭资源对象
        out.close();
    }
}
