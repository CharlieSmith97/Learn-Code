package Java核心类库_IO_part_02;
//动态编译和运行Java代码

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class P343 {
    public static void main(String[] args) throws IOException {
        String str="U Style!";
        eavl(str);
    }

    //执行str参数里面的内容，且在控制台输出！
    private static void eavl(String str) throws FileNotFoundException, IOException {
        //1.使用StringBuilder凭借一个Hello word！程序
        StringBuilder Buider = new StringBuilder(90);
        Buider.append("public class Hello Word{ ");
        Buider.append("public static void main(String[] args){");
        Buider.append(";");
        Buider.append("}");
        Buider.append("}");
        System.out.println(Buider);
        //2.把Buider里面的内容保存在文件中去！一个名字叫做Hello Word.java的文件夹里面去 因为这段内容是以 public 做修饰符修饰的！
        OutputStream out = new FileOutputStream("Hello Word.java");
        out.write(Buider.toString().getBytes());
        out.close();
        //调用Javac的进程来运行Hello Word.java
        /*
                Process exec(String command) 
            在单独的进程中执行指定的字符串命令。 
         */
        //3.调用javac进程来调用Hellow.java
        Process javacProcess = Runtime.getRuntime().exec("javac Hello Word.java");
        //4.读取javac进程中的错误流信息
        InputStream error = javacProcess.getErrorStream();
        byte[] bt = new byte[1024];
        int len = -1;
        while ((len = error.read(bt)) != -1) {
            String message = new String(bt, 0, len);
            System.out.println(message);
        }
        error.close();
        //5.调用Java程序来运行 HelloWord.class
        Process javacPro=Runtime.getRuntime().exec("java Hello Word");
        //6.读取Java进程中的流信息
        //读取进程中的数据
        InputStream info = javacProcess.getInputStream();
        while ((len = info.read(bt)) != -1) {
            String message = new String(bt, 0, len);
            System.out.println(message);
        }
        info.close();
        //7.删除Java和class文件
        new File("Hello Word.java").delete();
    }
}
