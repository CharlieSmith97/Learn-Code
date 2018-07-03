package Java核心类库_IO_part_03;
//对象输入流/对象输出流  ObjectInputStream/ObjectOutputStream

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class P360 {
    public static void main(String[] args)throws IOException, Exception {
        //序列化/反序列化 WriteObject/ReadObject调用一下该函数将对象做序列化/反序列化操作！
         File f1=new File("D:\\dos编译","Temp_02.txt");
         readerObject(f1);
    }
    //序列化 
    private static void writeobject(File f1)throws Exception {
        FileOutputStream Output=new FileOutputStream(f1);
        ObjectOutputStream out=new ObjectOutputStream(Output);
        out.writeObject(new P360_01("小明","Monster797",20));
        out.close();
    }
    //反序列化
    private static void readerObject(File f1)throws Exception {
        FileInputStream Input=new FileInputStream(f1);
        ObjectInputStream in=new ObjectInputStream(Input);
        P360_01 user=(P360_01)in.readObject();
        System.out.println(user);
        in.close();
    }
}
