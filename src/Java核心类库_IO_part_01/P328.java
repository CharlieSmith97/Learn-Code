package Java核心类库_IO_part_01;

import java.io.File;
import java.io.IOException;
    /*
    File的文件操作：
      boolean 	isFile 判断是否为一个标准文件！
 	  boolean  createNewFile ：创建临时文件
	  static File createTempFile（String prefix，String suffix）：创建临时文件 	
	  boolean delete ：删除文件
	  void  deleteOnExit：在JVM停止时删除文件
	  boolean exists ：判断文件是否存在
	  boolean renameTo （File dest）：重新修改名称 			
    */
public class P328 {
    public static void main(String[] args) throws IOException {
        Text1();
    }

    private static void Text1() throws IOException {
        File dir=new File("D://Demo测试文件夹");
        File f1=new File(dir,"123.txt");
      /*
        if (true==f1.isFile()) {
            JOptionPane.showMessageDialog(null,"这是一个标准文件!");
        }else{
            JOptionPane.showMessageDialog(null,"这是不是一个标准文件!");
        }  
      */
        if (!f1.exists()) {
            f1.createNewFile();//当文件不存在的时候就创建一个新的文件
        }else{
            f1.renameTo(new File(dir,"345.txt"));//如若存在的话那么就对该文件夹的文件修改名称操作！
        }
        System.out.println("-----------------美丽丽的分割线！------------------");
        File.createTempFile("Will","txt",dir);
    }
}
