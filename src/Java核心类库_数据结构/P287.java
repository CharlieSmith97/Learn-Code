    //双向队列
package Java核心类库_数据结构;

public class P287 extends P284 {
    public static void main(String[] args) {
        P287 deque = new P287();
        deque.addFirst("Will");
        deque.addLast("A");
        System.out.println(deque);
    }

    public Object getFrist() {
        return this.frist;
    }

    public Object getLast() {
        return this.last;
    }

    public void removeFrist() {
        remove(this.frist);//调用父类中的第一个节点对象
    }

    public void removeLast() {
        remove(this.last);//调用父类中的最后一个节点对象
    }

    public void addFirst(Object ele) {
        //对父类提供的方法进行复用 可以减少代码量的同时也体现了面对对象的特性（继承，封装，多态）
        super.addFirst(ele);
    }

    public void addLast(Object ele) {
        super.addLast(ele);
    }
}
/**
 * 该代码段存在的问题： 破坏了代码的封装问题 存在一些不合理的方法（只需根据具体需求设计好合理的方法！） 性能方面可能比较低下！
 * 改代码段一定要遵循从主线程（main）方法从上往下的执行顺序来对代码的编写！ 之前因为方法调用在执行顺序上欠缺考虑 编写的顺序写错了 
 * 导致直接先添加的最后的内容导致报错 出现空引用！ NullpointerException出现该异常！所以在编辑代码的时候一定要谨慎编写 注意代码Conding！
 */
