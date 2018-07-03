package JAVA语言新特性_Java8;
//Java8-lambda中的变量

import static javax.management.Query.times;

public class P414 {
    public static void main(String[] args) {
        new P414().Demo1("小宁",2);
    }

    public void Demo1(String content,int times) {
        Runnable run = () -> {
            for(int i=0;i<times;i++){
            System.out.println(content);
            }
        };
        new Thread(run).start();
    }
}
