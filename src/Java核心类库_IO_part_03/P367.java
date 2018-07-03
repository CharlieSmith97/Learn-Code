package Java核心类库_IO_part_03;
//数据流：DataInputStream数据输入流 DataOutputStream数据输出流！

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P367 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f1=new File("D:\\dos编译","Temp_02.txt");
      //Write(f1);
        Read(f1);
    }

    private static void Write(File f1)throws FileNotFoundException, IOException {
        FileOutputStream out=new FileOutputStream(f1);
        DataOutputStream Out=new DataOutputStream(out);
        Out.writeUTF("你好！");
        Out.close();
    }

    private static void Read(File f1) throws FileNotFoundException, IOException {
        FileInputStream in=new FileInputStream(f1);
        DataInputStream In=new DataInputStream(in);
        System.out.println(In.readUTF());
        In.close();
    }

}
