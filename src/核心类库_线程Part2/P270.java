//联合线程！
package 核心类库_线程Part2;
public class P270 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Being");
            JOIN JoinThread=new JOIN();//创建JOIN对象！
        for (int i = 0; i < 50; i++) {
            System.out.println("Main"+i);
            if (i==10) {
                JoinThread.start();//创建线程对象并且启动！
            }if (i==20) {
                JoinThread.join();//强制运行该线程！ 等到Mian线程到20的时候 强制运行join线程直至结束 才运行Main线程！
            }
        }
        System.out.println("Ending");
    }
}

class JOIN extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("JOIN"+i);
        }
    }
}