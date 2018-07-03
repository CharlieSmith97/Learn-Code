package Java核心类库_IO_part_01;

import java.io.File;

public class P329 {

    public static void main(String[] args) {
        text1();
        /*
        File的目录操作：
	boolean isDirectory：   判断是否为目录
	boolean mkdir：         创建当前目录
	boolean mkdirs：		创建当前目录和上级目录
	String[] list():	列出所有的文件名
	File [] listFiles():  	列出所有的文件对象
	static File[] listRoots(): 列出系统盘符 		
         */
    }

    private static void text1() {
        File dir = new File("D://Demo测试文件夹");
        File f1 = new File(dir, "345.txt");//该File对象为文件，而并非目录！
        System.out.println(dir.isDirectory());
        System.out.println(f1.isDirectory());
        /*
         if (dir.mkdir()) {
            System.out.println("正在创建目录！");
            
        }else{
            System.out.println("抱歉！该目录已经存在！");
        }
         */
        if (f1.mkdirs()) {
            System.out.println("正在创建目录！");
        } else {
            System.out.println("抱歉！该目录的当前目录和上级目录已经存在！");
        }
        System.out.println("-----------------------------------------");
        //在文件夹里面列举出所有的文件名 以及所有的文件对象 还有列出的盘符！
        String [] name=dir.list();//表示单个文件 然后对文件做迭代操作！ 对整个文件夹里的文件对象做遍历操作！
        for (String string : name) {
            System.out.println(string);
        }
        System.out.println("File目录中的文件对象列举：");
        File[] n1=dir.listFiles();
        for (File file : n1) {
            System.out.println(file);
        }
        System.out.println("文件目录的盘符列举：");
        File [] ff=dir.listRoots();
        for (File file : ff) {
            System.out.println(file);
        }
    }
}
