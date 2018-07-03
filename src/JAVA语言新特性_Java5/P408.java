package JAVA语言新特性_Java5;
//Java7-Java7特性概述

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class P408 {
    public static void main(String[] args) throws IOException {
        int b=0b101;
    //01.使用二进制数字表达式
        System.out.println(b);
    //02.使用下划线对数值进行分隔表达 binary
        
    //03.switch支持String变量 底层有hashCode方法 返回的是int类型
    
    /*
        String str="C";
        switch(str){
            case "A":
                JOptionPane.showMessageDialog(null,"This is A!");
            break;
            case "B":
                JOptionPane.showMessageDialog(null,"This is B!");
            break;
            case "C":
                JOptionPane.showMessageDialog(null,"This is C!");
            break;
            default:
                JOptionPane.showMessageDialog(null,"你输入的信息不在该范围里面！");
                break;    
        }
    */ 
            Date d=new Date();
            System.out.println(d.toLocaleString());//获取本地时间
            System.out.println(Objects.toString(d));
            Random R=new Random();
            System.out.println(R.nextInt(100));
            //ThreadLocalRandom 设定一个数值范围的随机数
            ThreadLocalRandom T=ThreadLocalRandom.current();
            System.out.println(T.nextInt(100,200));
            /*
            next(int bits) 
            生成下一个伪随机数。 
            */
            //文件拷贝
            Path path=Paths.get("");//拷贝文件的目录
            Files.copy(new FileInputStream(new File("","")),path);//被拷贝文件的目录
    }
    /*
        Java7-概述：
	01.使用二进制数字表达式
	02.使用下划线对数值进行分隔表达
	03.switch支持String变量
		就是hashCode方法
		switch支持byte，short，char，int以及对应的包装类
		枚举（enum），ordinal方法
		String（hashCode方法）
	04.Objects类，ThreadLocalRandom 对象的工具类！
	05.泛型的菱形语法
	06.堆污染和@SafeVarargs 用来抑制堆污染警告的！
	07.同时捕获多个异常 且不能更改异常对象！
        try {
            //打开资源
            //必须是实现于AutoCloseable接口的    
        } catch (Exception |Exception e) {
        }
        08.增强Throw语句
	09.try-with-resources语句 自动资源关闭
	10.NIO2介绍（File，Path，Paths）把文件映射成资源的一部分 异步传输！ 提高效率
     */
}
