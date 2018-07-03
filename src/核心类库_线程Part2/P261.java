//线程通信-生产者与消费者案例
package 核心类库_线程Part2;
//生产者类

public class P261 implements Runnable {

    //共享的资源对象
    private P261_01 resource = null;

    public P261(P261_01 resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            if (i % 2 == 0) {
                resource.push("小明", "男");
            } else {
                resource.push("小洁", "女");
            }
        }
    }

}
