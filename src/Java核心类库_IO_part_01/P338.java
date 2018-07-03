package Java核心类库_IO_part_01;
//文件字节输入流

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class P338 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //1.创建源
        File file=new File("D:\\dos编译","Temp_01.txt");
        //2.创建文件输入对象（水管）
        FileInputStream input=new FileInputStream(file);
        //3.具体的读取操作 
        /*
        int read() 
        从该输入流读取一个字节的数据。  
        int read(byte[] b)        读取多个字节并且存储到别的数组里面中去！ 
        从该输入流读取最多 b.length个字节的数据为字节数组。  
        int read(byte[] b, int off, int len) 
        从该输入流读取最多 len字节的数据为字节数组。  
        */
        byte[] bf=new byte[5];//每次最多能读取五个字节
        System.out.println(Arrays.toString(bf));//以数组的显示形式来表示 bf 但是bf的5个元素都为空！
        System.out.println("----------------------元素读取检查操作！-------------------------");
        /*
        input.read(bf);对文件目录里的文件内容进行内容读取操作 只是读取并没有在IDE里面读取出来！  需要在输出栏里面显示出来则需要打印操作！
        System.out.println("该文件中读取的内容为：");    
        System.out.println(Arrays.toString(bf));
        //把byte数组转为字符串
        String str=new String(bf,0,12);
        System.out.println(str);
        */
        //4.关闭资源对象
        int len=-1;//表示当前读取字节总数，如果为-1读取到末尾了！
        //String(byte[] bt,int offset,int length) bytes - 要解码为字符的字节 offset - 要解码的第一个字节的索引 length - 要解码的字节数
        while((len=input.read(bf))!=-1){
            String str=new String(bf,0,len);
            System.out.println(str+"\t"+"每次加载元素的数量："+str.length());
        }   
        input.close();
    }
}
