package JAVA语言新特性_Java5;
    /*
    JAVA语言新特新-Java5静态引入 但是其实是已给语法糖！ 
    开发中不推荐使用！因为不知道静态成员来源于哪一个类！
    */

import java.util.Date;
import java.util.List;
import java.util.Set;
import static java.lang.Math.*;
public class P399 {
    public static void main(String[] args) {
        //在导入包的时候可以手动或者自动导入包 可以使用* 但是底层通配符匹配的字符串是一个具体的包名！ 
        Date d=null;
        List list=null;
        Set st=null;
        //这样的静态引入可以直接调用API包中的静态方法 不需要用API报名的全限定名称来写了
        System.out.println("两个数中最大的值为："+max(10,20));
        System.out.println("两个数中最小的值为："+min(10,20));
    }
}
