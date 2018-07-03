package Java核心类库_集合框架part_01;

import java.util.ArrayList;
import java.util.List;

/*
    通配符的上限和下限
 */
public class P305 {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        List<Integer> ls1 = new ArrayList<>();
        List<Number> ls2 = new ArrayList<>();
        Dowork1(ls);//String类型不继承Number类
        Dowork1(ls1);
        Dowork1(ls2);

        Dowork2(ls);
        Dowork2(ls1);
        Dowork2(ls2);
    }

    //此时的泛型，必须是Number或者Number的子类！限定上限！
    private static void Dowork1(List<? extends Number> list) {
        //当你不确定泛型为什么类型的时候可以在尖括号里面加一个问号作为通配符！
    }

    //此时的泛型，必须是Number或者Number的父类！限定下限！
    private static void Dowork2(List<? super Number> list) {
        //当你不确定泛型为什么类型的时候可以在尖括号里面加一个问号作为通配符！
    }
}
