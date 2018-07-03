//使用继承方式创建并启动线程
package 核心类库_线程Part1;
public class P246 {
    public static void main(String[] args) {
    //主线程运行游戏！  
    for (int i = 0; i < 50; i++) {
            System.out.println("打游戏！"+i);
             if (i==10) {
                //创建线程对象并启动该对象！
                MusicThread M=new MusicThread();
                 M.start();//启动线程 不能调用run方法
            }
        }
    }
}
    /*
        其中在线程的运行过程中最主要的还是线程调度上面起关键作用的 谁抢到了资源谁就优先运行！其中就有一定的随机性！
    */

class MusicThread extends java.lang.Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("播放音乐！"+i);
        }
    }
}