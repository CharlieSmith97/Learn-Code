package Java核心类库_集合框架part_01;

//vector类中的方法演示
import java.util.Vector;

public class P294 {

    public static void main(String[] args) {
        test_add();
        test_remove();
        text_set();
    }

    /**
     * boolean add（object E）：将指定元素添加到此向量的末尾，等价于addElement方法（因为历史遗留问题）。 void
     * add（Int index，Object Element） 在此向量中的指定位置添加指定的元素 boolean addAll(Collection
     * C)：把C集合中的素 有元素添加到当前集合对象中来！
     */
    private static void test_add() {
        Vector v1 = new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        System.out.println(v1);
        Vector v2 = new Vector();
        v2.add(1);
        v2.add(2);
        v2.add(3);
        v1.add(v2);
        System.out.println(v1);
        /*
        v1.add(v2);[A, B, C, [1, 2, 3]] 直接将V2添加到V1中  
        v1.addAll(v2);[A, B, C,1, 2, 3] 将Vector类对象中所有的元素都添加到V1中
         */
    }

    /**
     * Object Remove（Int index）：删除指定索引位置的元素，并且返回删除之后的元素 boolean Remove（Object
     * o）：删除指定的元素 boolean RemoveAll(Collection c):从此集合中移除包含在指定集合C中的所有元素！ boolean
     * retainAll(Collection c):在此集合中仅保留包含在指定集合C中的元素 用来求交集
     */
    private static void test_remove() {
        Vector v1 = new Vector();
        v1.add("A");
        v1.add("C");
        v1.add("B");
        v1.add("C");
        v1.remove("C");//当没有指定索引位置的删除的话 删除的则是从前往后迭代的元素
        System.out.println(v1);
    }

    private static void text_set() {
        /**
         * Object set(int index,Object Element):修改指定索引位置的元素，返回被替换的旧的元素
         */
        Vector v1 = new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        System.out.println(v1);
        v1.set(0, "C");
        System.out.println(v1);
    }
}
