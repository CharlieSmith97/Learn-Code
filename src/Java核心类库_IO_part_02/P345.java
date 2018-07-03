package Java核心类库_IO_part_02;
//IO字符文件输出流

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P345 {
    public static void main(String[] args) throws IOException {
        //1.创建文件源路径
        File f1=new File("D:\\dos编译","Temp_02.txt");
        //2.创建字符输出流对象
        FileWriter out=new FileWriter(f1,true);
        //3.写出操作
        /*
         void write(int c); 向外写出一个字符
         void write(char [] buffer); 向外写出多个字符 char[] char数组 
         void write(char[] buffer,int off,int len);  把指定数组中的数据写出到指定的位置和指定的数量
         void write(String str); 直接向外面写出一个字符串
        */
        out.write("You are Cool!");
        //对写入的文件对想做读取操作！
         FileReader in=new FileReader(f1);
         BufferedReader input=new BufferedReader(in);
         String line=null;
         //对目录文件中的数据做循环迭代输出操作 如果最后一行为空的话那么就停止循环迭代输出！
         while((line=input.readLine())!=null){
             System.out.println(line); 
         }  
        //4.字符输出流对象 资源关闭操作
        out.close();
    }
}
