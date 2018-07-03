//使用匿名内部类创建并启动线程  利用接口的方式！
package 核心类库_线程Part1;

public class P248 {
    public static void main(String[] args) {
            for (int i = 0; i < 50; i++) {
                System.out.println("玩游戏！"+i);
                if(i==10){
                new Thread(new Runnable(){
                    @Override
                    public void run() {
                        for (int i = 0; i < 50; i++) {
                            System.out.println("看电影！"+i);
                        }
                    }
                }).start();
            }
        }
    }
}
    /*
        同样在匿名内部类中实现了资源抢占的功能，从而实现程序语句执行的随机性（并非是从上到下的流程顺序执行的！）！
        接口形式的匿名内部类！
     */