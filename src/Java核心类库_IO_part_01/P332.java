package Java核心类库_IO_part_01;
//批量文件处理：名称案例-批量修改文件名称

import java.io.File;

public class P332 {

    public static void main(String[] args) {
        File dir = new File("文件集合目录");
        //返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
        File[] f1 = dir.listFiles();
        //需要被替换/被删除的文字
        String deleteText = "文件名";
        for (File file : f1) {
            //字符串包含指定的char值序列时才返回true。 如果这个字符串里面包含所需修改的内容 就对包含该字符串的文件做修改操作！
            if (file.getName().contains(deleteText)) {
                /*
                返回从替换所有出现的导致一个字符串 oldChar在此字符串 newChar 。  
                将需要删除的部分放在OldChar这边  然后将newChar这边改为 “” 空字符串，就实现了对文件的命名进行处理的预期结果！ 
                */
                String newFileName = file.getName().replace(deleteText, "");//这里的newFilename的名字是修改之后的！
                //重命名由此抽象路径名表示的文件。 
                file.renameTo(new File(dir, newFileName));  
            }
        }
    }
}
