//定时器和线程组
package 核心类库_线程Part2;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class P274 {
    public static void main(String[] args) {
        System.out.println("Begin");
        Timer TT=new Timer();
        TT.schedule(new TimerTask() {
            @Override
            public void run() {
                //每个一秒打印出一个中国（风格）时间！
                System.out.println(new Date().toLocaleString());
            }
        },3000,1000);
        System.out.println("Ending");
    }
}
