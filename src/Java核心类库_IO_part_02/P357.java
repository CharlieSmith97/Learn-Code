package Java核心类库_IO_part_02;
//文件合并流 SequenceInputStream

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class P357 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //创建顺序流对象
        File f1=new File("D:\\dos编译","Temp_02.txt");
        File f2=new File("D:\\dos编译","Temp_03.txt");
        //创建两个字节输出流对象
        FileInputStream in=new FileInputStream(f1);
        FileInputStream out=new FileInputStream(f2);
        //将两个文件流对象传入进去！ 得到一个合并流对象 然后将合并流对象里面的数据读出来！
        SequenceInputStream Sq=new SequenceInputStream(in,out);
        byte[] bt=new byte[1024];
        int len=-1;
        while((len=Sq.read(bt))!=-1){
            System.out.println(new String(bt,0,len));//将两个输入流对象合并在一个合并流对象里面的数据打印出来！
        } 
    }
}
