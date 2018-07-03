//随机数（Random-ThreadLocalRandom-UUID）：
package 核心类库_01;

import java.util.Random;

public class P218 {
    public static void main(String[] args) {
        Random r1=new Random(10);//随机数最大字符容量为10
        System.out.println(r1.nextBoolean());
        System.out.println(r1.nextDouble());
        System.out.println(r1.nextInt());
        System.out.println("------------------------------------------");
        Random r2=new Random(10);//随机数最大字符容量为10
        System.out.println(r2.nextBoolean());
        System.out.println(r2.nextDouble());
        System.out.println(r2.nextInt());
        System.out.println("------------------------------------------");
        //需求：生成34到179之间的随机数
        int  num=new Random().nextInt(145)+34;
        System.out.println("根据以上的条件生成的随机数为："+"\n"+num);
    }
}
/**
 *1.Random：生产一个伪随机数
    public Random（）：使用默认的种子（当前系统时间作为种子）
    public Random（long	seed）：根据指定的种子。
 */