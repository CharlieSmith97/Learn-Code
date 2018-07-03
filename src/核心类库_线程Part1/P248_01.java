//匿名内部类创建并启动线程  利用继承的方式
package 核心类库_线程Part1;

public class P248_01 {

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
                System.out.println("玩游戏！"+i);
                if(i==10){
                    new Thread(){ 
                        public void run(){
                        for (int i = 0; i < 50; i++) {
                            System.out.println("看电影！" + i);
                        }
                    }
                }.start();
            }
        }
    }

    private static void test1() {
        for (int i = 0; i < 50; i++) {
            System.out.println("玩游戏！" + i);
            if (i == 10) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                    }
                }).start();
            }
        }
    }
}
