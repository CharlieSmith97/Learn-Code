package Java核心类库_IO_part_02;
//文件的字符输入流 FileReader 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class P344 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f1=new File("D:\\dos编译","Temp_02.txt");
        FileReader in=new FileReader(f1);
        BufferedReader Reader=new BufferedReader(in);
        //对文件夹中的信息进行读取之后，并且打印出来！
        String line=null;
        while((line=Reader.readLine())!=null){
            System.out.println(line);
        }
        in.close();
    }
}
