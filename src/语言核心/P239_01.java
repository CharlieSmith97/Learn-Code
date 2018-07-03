//自动资源关闭  Java7中的异常新特性
package 语言核心;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class P239_01 {

    public static void main(String[] args) {
        tes1();
        tes2();
    }

    //Java7之前的手动资源关闭
    private static void tes1() {
        OutputStream out = null;
        try {
            //打开资源对象
            out = new FileOutputStream("c:/123.txt");
            //操作资源对象
            out.write(1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭资源！
            try {
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //Java7的自动资源关闭
    private static void tes2() {
        try (
                OutputStream out = new FileOutputStream("c:/123.txt");//try后面圆括号里面打开的资源 jvm会自动帮你关闭 打开资源对象
                abc1 a1=new abc1(); //里面对象所对应的类  要实现 implement AutoCloseable的接口！
            ) 
        {
            out.write(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class abc1  implements AutoCloseable{

    @Override
    public void close() throws Exception {
    }
}