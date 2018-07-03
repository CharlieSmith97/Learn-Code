package Java核心类库_IO_part_01;
/*
    获取File路径和检测状态
    主要是对API里面的一些方法的测试！
*/

import java.io.File;

public class P327 {

    public static void main(String[] args) {
        File f = new File("D://Demo测试文件夹/123.txt");
        File f1 = new File("D://Demo测试文件夹", "123.txt");

        File f2 = new File("D://Demo测试文件夹");
        File dir = new File(f2, "123.txt");
        System.out.println("-------------------- 结果显示！-------------------");
        System.out.println("构造方法一：" + "\n" + f);
        System.out.println("构造方法二：" + "\n" + f1);
        System.out.println("构造方法三：" + "\n" + dir);
        System.out.println("------------------美丽丽的分割线！----------------");
        text1();
        System.out.println("------------------美丽丽的分割线！----------------");
        text2();
    }

    /*
      操作File路径和名称：
      File      getAbsoluteFile()：获取绝对路径
      String    getAbsolutePath()：获取绝对路径
      String    getPath()：  获取文件路径
      String    getName()：  获取文件名称
      File      getParentFile()： 获取上级目录文件
      String    getParent()：     获取上及目录路径
     */
    private static void text1() {
        File F1 = new File("D://Demo测试文件夹/123.txt");
        System.out.println(F1.getAbsoluteFile());
        System.out.println(F1.getAbsolutePath());
        System.out.println(F1.getName());
        System.out.println(F1.getPath());
        System.out.println(F1.getParent());
        System.out.println(F1.getParentFile());
    }

    /*
      检测File状态的方法
      boolean canExecute()：  判断是否是可执行文件  
      boolean canRead()：     判断该文件是否可读
      boolean canWrite()：    判断该文件是否可写
      boolean isHidden()：    判断该文件是否是隐藏文件
      long  lastModified()：  判断文件最后的修改时间
      long  length()：        获取文件的长度大小（单位：字节）  
     */
    private static void text2() {
        File F2 = new File("D://Demo测试文件夹/123.txt");
        System.out.println(F2.canExecute());
        System.out.println(F2.canRead());
        System.out.println(F2.canWrite());
        System.out.println(F2.isHidden());
        System.out.println(new java.util.Date(F2.lastModified()).toLocaleString());//获取最后修改的时间并且转换为当地标准的时间显示！
        System.out.println(F2.length());
    }
}
