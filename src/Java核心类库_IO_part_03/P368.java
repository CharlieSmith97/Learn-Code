package Java核心类库_IO_part_03;
//IO-随机访问文件（RandomAccessFile）

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class P368 {

    public static void main(String[] args) throws Exception {
        File f1 = new File("D:\\dos编译", "Temp_02.txt");
        write(f1);
        read(f1);
    }

    private static void write(File f1) throws FileNotFoundException, IOException {
        //如果模式参数是不等于 "r"一个 ，"rw"，"rws"，或 "rwd"  应将模式里面的内容做枚举！  四种模式分别为： 读，读写，读写底层同步，
        RandomAccessFile Random = new RandomAccessFile(f1, "rw");
        Random.writeByte(65);
        Random.writeUTF("青丝若为霜！");
        Random.close();
    }

    private static void read(File f1) throws FileNotFoundException, IOException {
        RandomAccessFile Random = new RandomAccessFile(f1, "r");
        System.out.println("文件指针位置：" + Random.getFilePointer());//因为还没开始读！
        byte b = Random.readByte();
        /*
        seek(long pos) 
        设置文件指针偏移，从该文件的开头测量，发生下一次读取或写入。 
        skipBytes(int n) 
        尝试跳过 n字节的输入丢弃跳过的字节。 
         */
        String str = Random.readUTF();
        System.out.println(b + "\n" + str);
        Random.close();
    }
}
