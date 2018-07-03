package Java核心类库_IO_part_03;
//标准的IO操作
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class P364 {
    public static void main(String[] args) throws IOException {
        //system.set（）；
       System.setOut(new PrintStream(new File("D:\\dos编译","Temp_02.txt")));//输出打印流重新定向
        System.out.println("begin");
       int data= System.in.read();//接收键盘输入的字节
        System.out.println(data);//对该字节进行输出！
        System.out.println("Ending----------!");
    }
}
