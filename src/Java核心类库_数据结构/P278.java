//数据结构-完成初始化-添加打印功能
package Java核心类库_数据结构;
//安排运动员上场

import java.util.Arrays;


public class P278 {

    //模拟数据存储的案例：
    //模拟球员的球衣号码的存储：
    private static Integer[] playes = null;//场上球员的球衣号码
    private static int size = 0;//场上球员个数  
    //Integer 【】 playes=null  ------->上场球员不是固定的	
    //作为一个教练，要安排上场！

    //1.初始化容量为5的线性列表，准备用来存储场上的5个球衣号码。
    private static void init(int initialCapacity) {
        if (initialCapacity<0){
            throw new IllegalArgumentException("容量不能为负数！");
        }
        playes = new Integer[initialCapacity];
    }

    //2.安排五个球员上场（不确定）{11,22,33,44,55}
    private static void add(Integer playNum) {
        //       数组[index]=元素值！;
        if(size==playes.length)
        {
         Integer []temp= Arrays.copyOf(playes,playes.length*2);
                playes=temp;
        }   
        playes[size] = playNum;
        size++;
    }

    //3.查询指定位置的球员的球衣号码是多少，查询索引位置为2的球衣号码是33
    private static Integer get(int index) {
        if (index<0||index>=size){
            throw new IllegalArgumentException("索引越界！");
        }
        return playes[index];
    }

    //4.根据求原号码查询该球员在场上的索引位置，44号球衣的球员索引位置为：3
    private static int getIndexByplayerNum(Integer playesNum) {
        for (int index = 0; index < size; index++) {
            if (playes[index].equals(playesNum)) {
                return index;
            }
        }
      throw new IllegalMonitorStateException("数组越界！");
    }

    //5.替换场上的球员（索引位置为2的球员！替换之后该位置的球员的球衣编号为2！）
    private static void set(int index, Integer NewplayeNum) {
        if (index<0||index>=size){
            throw new IllegalArgumentException("索引越界！");
        }
        playes[index] = NewplayeNum;
    }

    //6.替换球衣号码为22的球员，替换之后为222
    private static void update(Integer OldplayeNum, Integer newplayeNum) {
        int index = getIndexByplayerNum(OldplayeNum);
        if (index >= 0) {
            set(index, newplayeNum);
        }
    }

    //7.把场上索引位置为2的球员罚下场！（注意没有替补）
    private static void delete(int index) {
        if (index<0||index>=size){
            throw new IllegalArgumentException("索引越界！");
        }
        for (int i = index; i < size - 1; i++) {
            //index+1移动到index位置
            playes[i] = playes[i + 1];
        }
        //把最后的位置设置为：null！
        playes[size - 1] = null;
        size--;
        //场上球员总数减一
    }

    //8.按照球员在场上的位置，打印出球衣号码，打印风格：{11,22,33,44,55}
    private static void print() {
        if (playes == null) {
            System.out.println("Null！");
            return;
        }
        if (size == 0) {
            System.out.println("[]");
            return;
        }
        StringBuilder Sb = new StringBuilder((size * 3) + 1);
        Sb.append("[");
        for (int index = 0; index < size; index++) {
            Sb.append(playes[index]);
            if (index != size - 1) {//判断是不是最后一个元素！
                Sb.append(",");
            } else {
                Sb.append("]");
            }
        }
        System.out.println(Sb.toString());
    }

    /**
     * StringBuilder底层是使用char数组存储的，所以每个字符占一个元素位置，11是两个字符，此处长度应该为size*3+1
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("五位选手的编号分别为：");
        //初始化容量为五的线性列表
        init(5);
        //安排五个球员上场！{11,22,33,44,55}
        add(11);
        add(22);
        add(33);
        add(44);
        add(55);
        print();
        //3.查询指定位置的球员的球衣号码是多少，查询索引位置为2的球衣号码是33
        //Integer num=get(2);
        //System.out.println(num);//调用
        //4.根据求原号码查询该球员在场上的索引位置，44号球衣的球员索引位置为：3
        //int index=getIndexByplayerNum(33);
        //System.out.println(index);
        //5.替换场上的球员（索引位置为2的球员！替换之后该位置的球员的球衣编号为2！）
        //set(2,333);
        //print();
        //6.替换球衣号码为22的球员，替换之后为222
        //update(33,888);
        //System.out.println("替换后的结果！");
        //print();
        //7.把场上索引位置为2的球员罚下场！（注意没有替补）
        delete(2);
        print();
    }

}
