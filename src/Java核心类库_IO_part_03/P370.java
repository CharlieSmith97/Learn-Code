package Java核心类库_IO_part_03;
//IO-NIO概述

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P370 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //利用Paths来获取文件的路径
        Path in=Paths.get("D:\\dos编译","Temp_02.txt");
        File f2=new File("D:\\dos编译","Temp_03.txt");
        FileOutputStream out=new FileOutputStream(f2);
        //Files,cpoy() 调用Files.copy()完成拷贝操作！
        Files.copy(in,out);
        /*
        其中根据不同的应用场景来选用方法 1.没有指定的输出源 out  2.没有指定的文件源路径 in 
        Files.copy(new FileInputStream（new File（"",""））,paths.get(new File("","")))
        Files.copy(paths.get(new File("","")),new FileOutputStream（new File（"",""））)
        */
        
    }
}
