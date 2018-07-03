package Java核心类库_IO_part_03;
//IO-管道流之间的线程通信 涉及到两个线程 因为是涉及到通信 最少是两个线程
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

//管道流
public class P369 {
    public static void main(String[] args) {
        try {
        AThread A=new AThread();
        BThread B=new BThread(A);
        A.start();
        B.start();
        } catch (Exception e) {
        e.printStackTrace();
        e.getMessage();
        }
    }
}

//A线程发送数据给B线程
class AThread extends Thread {
    //创建一个管道输出对象
    private PipedOutputStream out = new PipedOutputStream();
    //声明一个管道对象向外暴露的一个方法
    public PipedOutputStream getOut() {
        return out;
    }
    
    //提供一个在Run方法中的写入方法
    @Override
    public void run() {
        try {
            for (int i = 65; i < 65 + 26; i++) {
                //写入字母从A~Z！
                out.write(i);
            }
            out.close();
            System.out.println("Write写入任务完毕！");
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}

    //B线程接收A线程发送的数据
class BThread extends Thread {
     PipedInputStream in = null;
    //写一个构造方法 里面传入另外需要通信连接的线程对象! 以达到线程之间通信的目的！ 
    public BThread(AThread AT) throws Exception{
        in=new PipedInputStream(AT.getOut());
    }
    //提供一个在Run方法中的写入方法
    @Override
    public void run() {
         try {
             int len=-1;
             //每次做一次判断输出一个字节！
             while((len=in.read())!=-1){
                 //对读取的字节做打印操作！
                    System.out.println(len);
             } 
         } catch (IOException e) {
             e.printStackTrace();
             e.getMessage();
         }
    }
}
