//创建进程操作
package 核心类库_线程Part1;

import java.io.IOException;

public class P245 {
    public static void main(String[] args)throws IOException{
       //方式1：使用Runtime方法返回本类中的对象
       Runtime runtime=Runtime.getRuntime();
       //一个运行
       runtime.exec("notepad");
       ProcessBuilder pb=new ProcessBuilder("notepad");
       pb.start();
    }
}
