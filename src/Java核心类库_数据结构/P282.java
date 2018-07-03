package Java核心类库_数据结构;

import java.util.Arrays;

public class P282 {

    public static void main(String[] args) {
        P282 List = new P282(5);
        List.add(1);
        List.add(2);
        List.add(3);
        List.add("A");
        List.add("B");
        List.add("c");
        List.add(true);
        List.add(false);
        System.out.println(List);//打印List就相当于打印他的toString方法！
        System.out.println(List.size());
    }
    /**
     * 基于数组的列表（集合）
     */
    private Object[] elements = null;//场数组中存储了多少个元素！
   // private int size = 0;场上元素个数
      protected int size=0;  
    private static int default_initialCapacity = 10;

    //Object 【】 playes=null  ------->上场球员不是固定的	
    //作为一个教练，要安排上场！
    public P282() {
        this(10);//默认构造器传入10个参数！  底层默认设置
    }

    // 可以直接设置为构造器对数组容量做初始化
    public P282(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("容量不能为负数！");
        }
        elements = new Object[initialCapacity];
    }

    //2.保存新的元素  判断和扩容
    public void add(Object playNum) {
        //       数组[index]=元素值！;
        if (size == elements.length) {
            Object[] temp = Arrays.copyOf(elements, elements.length * 2);
            elements = temp;
        }
        elements[size] = playNum;
        size++;
    }

    //3.查询指定位置的元素
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引越界！");
        }
        return elements[index];
    }

    //4.根据求原号码查询元素的索引位置
    public int getIndexByplayerNum(Object playesNum) {
        for (int index = 0; index < size; index++) {
            if (elements[index].equals(playesNum)) {
                return index;
            }
        }
        throw new IllegalMonitorStateException("数组越界！");
    }

    //5.替换场上的元素
    public void set(int index, Object NewplayeNum) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引越界！");
        }
        elements[index] = NewplayeNum;
    }

    //6.替换制定位置的元素，替换的另一元素位置明确
    public void update(Object OldplayeNum, Object newplayeNum) {
        int index = getIndexByplayerNum(OldplayeNum);
        if (index >= 0) {
            set(index, newplayeNum);
        }
    }

    //7.删除指定索引位置的元素！
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("索引越界！");
        }
        for (int i = index; i < size - 1; i++) {
            //index+1移动到index位置
            elements[i] = elements[i + 1];
        }
        //把最后的位置设置为：null！
        elements[size - 1] = null;
        size--;
        //场上球员总数减一
    }

    //8.按照球员在场上的位置，打印出球衣号码，打印风格：{11,22,33,44,55}
    public String toString() {
        if (elements == null) {
            return null;
        }
        if (size == 0) {
            return "[]";
        }
        StringBuilder Sb = new StringBuilder((size * 3) + 1);
        Sb.append("[");
        for (int index = 0; index < size; index++) {
            Sb.append(elements[index]);
            if (index != size - 1) {//判断是不是最后一个元素！
                Sb.append(",");
            } else {
                Sb.append("]");
            }
        }
        return Sb.toString();
    }

    //元素数组里面的元素数量
    public int size() {
        return size;
    }

    //判断该数组是否为空！
    public boolean Isempty() {
        return size == 0;
    }

    //清空集合中的元素！
    public void clear() {
        elements = new Object[default_initialCapacity];
        size = 0;
    }
}
