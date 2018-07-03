//使用实现方式创建并启动线程
package 核心类库_线程Part1;

public class P247 {
    public static void main(String[] args) {
        //主线程：运行游戏 
        for (int i = 0; i < 50; i++) {
            System.out.println("打游戏"+i);
        //创建线程对象，并启动线程    线程启动之后拥有和主线程一样的级别！ 只是执行顺序是按照一定的流程执行的
             if(i==10){
                Runnable t=new MusicRun();
                Thread t1=new Thread(t);
                t1.start();    
             }
        }
    }
}
    //接口实现  Runnable 
 class MusicRun implements java.lang.Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("放歌！"+i);
            if(i==10){

            }
        }
    }
 }
