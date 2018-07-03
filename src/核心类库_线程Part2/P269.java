//线程的睡眠
package 核心类库_线程Part2;

public class P269 {
    public static void main(String[] args) {
        for (int i =10; i>0; i--) {
            System.out.println("还剩"+i+"秒！");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
           System.out.println("开始起飞！"); 
    }
}
