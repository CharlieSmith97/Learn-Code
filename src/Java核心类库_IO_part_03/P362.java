package Java核心类库_IO_part_03;
//IO打印流 PrintStream-PrintWriter

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class P362 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f1=new File("D:\\dos编译","Temp_02.txt");
        PrintStream p1=new PrintStream(f1);
        p1.write("ABC".getBytes());
        p1.append("c");
        p1.print(17);
        p1.print("How are you!");   
    }
}
