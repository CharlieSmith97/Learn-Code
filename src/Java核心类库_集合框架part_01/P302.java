package Java核心类库_集合框架part_01;
//深入分析For-each和迭代以及迭代删除操作！

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
1.可以操作数组！
底层依然使用for循环
2.可以操作Iterable的实例！
底层是用的是Iterator迭代器！
 */
public class P302 {

    public static void main(String[] args) {
        int[] i = {1, 2, 3};
        for (int j : i) {
            System.out.println(j);
        }
    }
}


