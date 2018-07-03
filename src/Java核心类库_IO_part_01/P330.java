package Java核心类库_IO_part_01;
//列出指定目录中的所有的文件  包括子文件夹 使用递归算法 recusion

import java.io.File;

public class P330 {

    public static void main(String[] args) {
        File Dir = new File("D:\\dos编译");
        ListAllFile(Dir);
    }

    //列出所有的文件 
    private static void ListAllFile(File f) {
        //列出所有的文件对象   对目录进行多级判断！
        //第一季文件目录 
        File[] f1 = f.listFiles();
        for (File file : f1) {
            //打印目录和文件 
            System.out.println(file);
            if (file.isDirectory()) {
                /*
            如果子文件是目录则继续递归，如果子文件是文件则打印出来！
            如果是目录的话则继续迭代目录！
            递归的话出口在于 如果子文件是文件而并非目录的话并不会再次进行递归操作！
                 */
                ListAllFile(file);
            }
        }
    }
    /*
     方法一：通过手动复写循环迭代对多级目录文件进行列举！   
    //第一季文件目录
   File [] f1=f.listFiles(); 
    for (File file : f1) {
            System.out.println(file);
            //System.out.println("--------------------------");
            //第二级文件目录
            if (file.isDirectory()) {
             File[] f2= file.listFiles();
                for (File file1 : f2) {
                    System.out.println(file1);
                    //System.out.println("--------------------------");
                    //第三级文件目录
                    if (file1.isDirectory()) {
                      File [] f3=file1.listFiles();
                        for (File file2 : f3) {
                            System.out.println(file2);
                            //System.out.println("--------------------------");
                            //第四季文件目录
                            if (file2.isDirectory()) {
                                File [] f4=file2.listFiles();
                                for (File file3 : f4) {
                                    System.out.println(file3);
                                //System.out.println("--------------------------");
                                //可以根据实际情况结合所需的File方法对文件目录做细分操作！
                                }
                            }
                        }
                    }
                }
            }
        }
     */
}
