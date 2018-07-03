package Java核心类库_数据结构;
//基于双向链表集合

import static java.util.concurrent.ThreadLocalRandom.current;

public class P284 {

    protected Node frist;//节点第一个元素
    protected Node last;//节点第一个元素
    protected int ele;//节点中的数据
    protected int size = 0;//单向链表中的数据

    //设置一个查询方法    
    public Node search(Object ele) {
        //找到被删除的节点
        Node current = this.frist;//第一个节点
        for (int i = 0; i < size; i++) {
            //判断当前的节点对象与传入的ele对象是否相等 取反！则是提示没有存在！
            if (!current.ele.equals(ele)) {
                if (current.next == null) {
                    return null;
                    //直接返回一个空！
                }
                current = current.next;
            }
        }
        return current;
    }

    public void remove(Object ele) {
        //找到被删除的节点
        Node current = this.frist;//第一个节点
        for (int i = 0; i < size; i++) {
            //判断当前的节点对象与传入的ele对象是否相等 取反！则是提示没有存在！
            if (!current.ele.equals(ele)) {
                if (current.next == null) {
                    return;
                    //表示节点从头到尾一直都找不到  就直接return停止
                }
                current = current.next;
            }
        }
        //删除节点
        if (current == frist) {
            this.frist = current.next;
            this.frist.prev = null;
            //则该节点的上一个节点对象则为空！ 
        } else if (current == last) {
            this.last = current.prev;
            this.last.next = null;
            //最后一个的下一个节点对象则为空！
        } else {
            current.prev.next = current.next;
            //把删除当前节点的下一个节点作为删除节点上一个节点的next
            current.next.prev = current.prev;
            //把删除节点的上一个节点作为删除节点的下一个节点的prev
        }
        size--;
        //把删除节点的对象显示出来！
        //System.out.println("current=" + current.ele);
    }

    public void addFirst(Object ele) {
        Node node = new Node(ele);//需要保存的节点对象
        if (size == 0) {
            this.frist = node;
            this.last = node;
        } else {
            node.next = this.frist;
            this.frist.prev = node;
        }
        size++;
    }

    public void addLast(Object ele) {
        Node node = new Node(ele);//保存的一个节点对象
        if (size == 0) {
            this.frist = node;
            this.last = node;
        } else {
            //新增节点作为之前的最后一个的下一个节点
            this.last.next = node;
            //把之前最后一个节点作为新增节点的上一个节点
            node.prev = this.last;
            //把新增节点作为最后一个节点
            this.last = node;
        }
        size++;
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(size * 3 + 1);
        Node current = this.frist;
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(current.ele);
            if (i != size - 1) {
                sb.append(".");
            } else {
                sb.append("]");
            }
            current = current.next;
        }
        return sb.toString();
    }
}

//链表中的每一个节点
class Node {

    Node prev;//节点中的上一个
    Node next;//节点中的下一个
    Object ele;//节点中的内容

    public Node(Object ele) {
        this.ele = ele;
    }
}
