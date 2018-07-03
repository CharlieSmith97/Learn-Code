package Java高级进阶;
//加载资源文件路径

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class P397 {
    public static void main(String[] args)throws IOException {
        test1();
        test2();
        test3();
        
    }
    //方式1:使用绝对路径加载资源
    private static void test1() throws IOException {
        Properties pr=new Properties();
        InputStream inStream=new FileInputStream(new File("",""));
        pr.load(inStream);
        System.out.println(pr);
    }
    //方式2：
    private static void test2() throws FileNotFoundException, IOException {
        Properties pr=new Properties();
        //获取当前线程对象的 ClassLoader
        ClassLoader Cl=Thread.currentThread().getContextClassLoader();
        InputStream inStream=Cl.getResourceAsStream("classPath路径中的所需的文件的文件名称！");
        pr.load(inStream);
        System.out.println(pr);
    }
    //方式3：
    private static void test3() throws IOException {
        Properties pr=new Properties();
        //getResourceAsStream（） 里面传入的是文件全限定名称
        InputStream inStream=P397.class.getResourceAsStream("字节码文件的名称！");
        pr.load(inStream);
        System.out.println(pr);   
    }
}
