//final修饰的变量
package Java面向对象part4;

public class P162_2 {
    final static String name="aaa";//需要显示指定的初始值  确切的初始值
    public static void main(String[]args){
       // name="bb";
        /* 在main方法里面又重新定义final变量是不行的 违反了一旦赋予初始值就不能再重新赋值的原则
        Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - 无法为最终变量name分配值
	at Java面向对象part4.P162_2.main(P162_2.java:7)
        C:\Users\甘柳\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
        构建失败 (总时间: 0 秒)

        */
        System.out.println(name);
    }
}
    