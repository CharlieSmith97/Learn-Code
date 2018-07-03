package Java核心类库_集合框架part_01;

import java.util.LinkedList;

/*
    LinkedList类的设计和操作
    LinkedList类实现了单向队列和双向队列的接口
*/    
public class P297 {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.addFirst("A");
        System.out.println(list);
        
    }
}
