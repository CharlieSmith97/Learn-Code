    /*
    用户与程序的交互  就是程序接受用户输入的数据 人机之间的交互体验 就是人与系统之间的数据传递与反馈*
    */
package Java基本工具;

import java.io.Console;
import java.util.logging.ConsoleHandler;

public class P206 {
    public static void main(String[] args) {
        Console console=System.console();
        //读取用户输入的一行数据
        String line=console.readLine();
        System.out.println(line);
    }
}
//这个类是不能直接在IDE中使用 而是要将源代码复制利用系统的DOS命令符去启动