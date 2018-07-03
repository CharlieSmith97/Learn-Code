package Java核心类库_IO_part_02;
//IO拷贝指定目录的制定类型文件到指定目录

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.System.out;

public class P342 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //1.找到源文件中所有的txt文件
        File f1 = new File("D:\\dos编译");
        File f2 = new File("D:\\dos编译\\拷贝文件放置文件夹");
        File[] dirf = f1.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(dirf);
        //2.迭代出每一个文件对象并且拷贝 
        for (File file : dirf) {
            //1.创建流对象 ： 输入输出流对象
            InputStream in = new FileInputStream(file);
            OutputStream out = new FileOutputStream(new File(f2, f1.getName()));

            //2.创建管道
            byte[] bt = new byte[1024];//1KB 一次性可以读取1024个字节！
            int len = -1;
            while ((len = in.read(bt)) != -1) {
                len = in.read(bt);
                out.write(bt, 0, len);
            }
            in.close();
            out.close();
            /*
            修改拷贝文件之后的名称
            File[] f1 = dir.listFiles();
            需要被替换/被删除的文字
            String deleteText = "文件名";
            for (File file : f1) {
            字符串包含指定的char值序列时才返回true。 如果这个字符串里面包含所需修改的内容 就对包含该字符串的文件做修改操作！
            if (file.getName().contains(deleteText)) {
                返回从替换所有出现的导致一个字符串 oldChar在此字符串 newChar 。  
                将需要删除的部分放在OldChar这边  然后将newChar这边改为 “” 空字符串，就实现了对文件的命名进行处理的预期结果！ 
                String newFileName = file.getName().replace(deleteText, "");//这里的newFilename的名字是修改之后的！
                重命名由此抽象路径名表示的文件。 
                file.renameTo(new File(dir, newFileName));  
            }
             */
        }
    }
}
