package Java核心类库_IO_part_03;
//扫描器类：Scanner

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P365 {
    public static void main(String[] args) throws FileNotFoundException {
        //对文件中的数据进行扫描
        File f1 = new File("D:\\dos编译", "Temp_02.txt");
        //Scanner sc=new Scanner(f1);
        Scanner sc = new Scanner(System.in);//标准输入流的扫描流（键盘输入流）并且对数据做输出操作！
        /*
        如果扫描仪的输入中有另一行，则返回true。 
        此方法可能会在等待输入时阻塞。 扫描仪不会超过任何输入
        对下一行做判断！ 如果有的话则继续输出里面的内容元素！
         */
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println("元素输出：");
            System.out.println(line);
        }
        sc.close();
    }
}
