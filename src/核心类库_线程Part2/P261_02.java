//消费者
package 核心类库_线程Part2;

public class P261_02 implements Runnable {

    private P261_01 resource = null;

    public P261_02(P261_01 resoure) {
        super();
        this.resource = resoure;
    }

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            resource.popup();
        }
        System.out.println("吃完了！");
    }

}
