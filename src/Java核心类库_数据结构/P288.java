package Java核心类库_数据结构;
//栈（Stack）

public class P288 extends P282 {

    public static void main(String[] args) {
        P288 jj = new P288();
        jj.push("A");
        jj.push("B");
        jj.push("C");
        jj.push("D");
        System.out.println(jj);

    }

    //入栈
    public void push(Object ele) {
        super.add(ele);
    }

    //删除栈顶元素
    public void pop() {
        int index = super.size() - 1;
        super.delete(index);
    }

    //查询栈顶元素
    public Object peek() {
        //该数组中的索引位置最后的为该栈的栈顶
        int index = super.size() - 1;
        return get(index);
    }
}
