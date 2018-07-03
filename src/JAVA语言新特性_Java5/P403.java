package JAVA语言新特性_Java5;
//Java5-for-each和Iterator的选择：
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
public class P403 {
    public static void main(String[] args) {
        /*
        需求：
            1.求价格总和
         */
        P400 p1 = new P400("手机", 888, 10);
        P400 p2 = new P400("充电宝", 50, 12);
        P400 p3 = new P400("内存条", 900, 13);
        //创建一个数组对象 并且该数组集合里面传入值 
        List st=new ArrayList();
        st.add(p1);
        st.add(p2);
        st.add(p3);
        List li=fiter1(st);//对集合对象做筛选操作 
        System.out.println(li);
    }

    //商品筛选零售价在200以上的商品 如果零售商品的价格在200以下 应该从集合中删除掉！
    public static List fiter(List list){
        for (Object O : list) {
            P400 pp=(P400) O;
            if (pp.getPrice()<200) {
                //如果价格少于200的话 那么就相对应删除当前的商品信息！ 调用List对象中的remove方法！
                list.remove(pp);
            }
        }
        return list;
    }
    
    /*
    迭代的时候就使用迭代器的删除方法（Iterator.remove()）;
	会删除当前迭代的元素，但是会做同步，把源集合和集合副本做同步，就不会报并发修改异常！
    */
    public static List fiter1(List list){
        for (Iterator it=list.iterator();it.hasNext();) {
            P400 pp=(P400) it.next();
            if (pp.getPrice()<200) {
                list.remove(pp);
            }
        }
        return list;
    }
    
}    
    /*  求商品总价格
        public static double getTotalPrice(P400... items) {
        double sum = 0.0;
        for (P400 item : items) {
            sum += item.getPrice() * item.getNum();
        }
        return sum;
    }
    */