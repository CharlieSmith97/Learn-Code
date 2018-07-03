package Java核心类库_IO_part_01;
//文件过滤器

import java.io.File;
import java.io.FilenameFilter;

public class P333 {
    public static void main(String[] args) {
        File dir = new File("D://dos编译//字符的输入输出");
        File[] fs = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile() && name.endsWith(".avi") ;
                }
            });
        for (File f : fs) {
            System.out.println(f);
        }
    }
}
