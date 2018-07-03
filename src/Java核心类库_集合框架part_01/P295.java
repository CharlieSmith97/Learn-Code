package Java核心类库_集合框架part_01;
//关于Stack类中的方法演示

import java.util.ArrayDeque;
import java.util.Stack;

public class P295 {

    public static void main(String[] args) {
        Stack s1 = new Stack();
        //将项目推送到此堆栈的顶部。 
        s1.push("A");
        s1.push("B");
        s1.push("C");
        System.out.println(s1);
        System.out.println(s1.peek());//打印栈顶元素
        s1.pop();//删除栈顶元素
        System.out.println(s1.peek());
        System.out.println(s1);//打印该栈元素
        System.out.println("------------一条忧伤的分割线！---------------");
        ArrayDeque d1=new ArrayDeque();
        //将元素推送到由此deque表示的堆栈上。 换句话说，将该元素插入到此deque的前面。
        d1.push("A");
        d1.push("B");
        d1.push("C");
        System.out.println(d1);
        System.out.println(d1.peek());//打印栈顶元素
        d1.pop();//删除栈顶元素
        System.out.println(d1.peek());
        System.out.println(d1);//打印该栈元素
        /*
          利用ctrl加G，对选中区域进行替换操作！ 
        */
    }
}
