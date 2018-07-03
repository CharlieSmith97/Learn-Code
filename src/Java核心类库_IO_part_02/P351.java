package Java核心类库_IO_part_02;
//IO字符缓冲流（BufferedReader-BufferedWriter）

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P351 {
    public static void main(String[] args) throws IOException{
        //字符缓冲输出流
        File f1=new File("D:\\dos编译","Temp_02.txt");
        FileWriter out=new FileWriter(f1);
        //把输出流对象包装在缓存区中！  性能好！ 再由缓存区中集中做操作处理！
        BufferedWriter bos=new BufferedWriter(out);
        bos.write("君不见黄河之水天上来");
        bos.newLine();
        bos.write("奔流到还不复还");
        bos.close();
        
        //字符缓冲输入流
        File f2=new File("D:\\dos编译","Temp_02.txt");
        FileReader in=new FileReader(f2);
        BufferedReader cos=new BufferedReader(in);
//        char[] bt=new char[1024];
//        int len=-1;
//        while((len=cos.read(bt))!=-1){
//            //字符串包装new String(bt,0,len); 
//            System.out.println(new String(bt,0,len));
//        }
        String line="null";//表示读取的行
        while ((line=cos.readLine())!=null){
          System.out.println(line);  
        }  
        cos.close();
    }
}
