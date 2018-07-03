package JAVA语言新特性_Java8;
//Java8-lambda函数式编程中遇到的问题！ 以及对lambda表达式的详细讲解！

import java.util.Arrays;
import java.util.Comparator;

public class P410 {
    public static void main(String[] args) {
        /*
        因为是两个方法 但是这两个方法如果不是静态方法的化那么就无法在本类中不创建对象的时候调用该方法！ 
        所以将两个方法定义为静态方法！
            解决方案：
              可以将其中的方法分装在另外一个类中！ 然后直接在主类中创建该类的对象调用里面的方法！
         */
        P410_01 pp=new P410_01();
        pp.testOldP410_01();
        pp.testOld();
    }
}

class P410_01 {
    public String name;
    public int Score;
    //构造方法
    public P410_01() {
    }
    
    public P410_01(String name, int Score) {
        super();
        this.name = name;
        this.Score = Score;
        //在syst中默认打印的是 该类中的toString方法
    }

    public  void testOldP410_01() {
        P410_01[] p = new P410_01[]{new P410_01("小明", 88), new P410_01("小李", 90), new P410_01("乔治", 95)};
        //对该数组（P410）进行排序（根据成绩做排序操作）
        /*
         Arrays.sort(p, new Comparator<P410_01>() {
            @Override
            public int compare(P410_01 o1, P410_01 o2) {
                return Integer.compare(o1.Score, o2.Score);
            }
        });
        */
        //lambda表达式 代码块简化！
        Arrays.sort(p,(o1,o2)->Integer.compare(o1.Score, o2.Score));
        System.out.println(Arrays.toString(p));
    }

    public  void testOld() {
        /*
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello lambad!");
            }
        }).start();
        */
        new Thread(()->System.out.println("Hello lambad!")).start();
    }    
        @Override
    public String toString() {
        return "P410{" + "姓名=" + name + ", 成绩=" + Score + '}';
    }
}
/*  
    使用lambda表达式优化程序语句之后的代码块
    相对来讲的话就相当于省略了方法名称和参数列表以及数据返回类型！
    但是心里大体可以知道sort方法里面一定实现了Comparator接口 以及实现了里面的compare方法 且该方法一定返回的类型是int类型！
    如果代码块中只有一行的话
    public void testOldP410() {
        P410[] p= new P410[]{new P410("小明", 88), new P410("小李", 90), new P410("乔治", 95)};
          对该数组（P410）进行排序（根据成绩做排序操作）
        Arrays.sort(p,(o1,o2)->
        Integer.compare(o1.Score,o2.Score));
        System.out.println(Arrays.toString(p));
    }
*/
