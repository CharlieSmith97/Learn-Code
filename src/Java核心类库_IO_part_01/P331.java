package Java核心类库_IO_part_01;
    //列出文件的分层结构 
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

   
public class P331 {
    public static void main(String[] args) {
        //分层结构 dos编译>字符的输入输出>TEMP_01.txt
        String file="D:\\dos编译\\字符的输入输出\\TEMP_01.txt";
        File f1=new File(file);
        
        //父级目录，视频
        System.out.println(f1.getParentFile().getName());
        System.out.println(f1.getParentFile().getParentFile().getName());
        System.out.println("-------------------------------------");
        List<String> parentName=new ArrayList<>();
        ListAllParent(parentName,f1);
        
        System.out.println(parentName);
        Collections.reverse(parentName);//颠倒集合元素的顺序！
        System.out.println(parentName);
        StringBuilder sb=new StringBuilder(40);
        for (String string :parentName) {
            sb.append(string).append(">");
        }
        sb.deleteCharAt(sb.length()-1);//去掉sb的最后下表也就是最后一个字符！
        System.out.println(sb);
    }
    
    //获取并且打印上级目录 该递归的出口时当该目录的上级目录为空的时候！
    private static void ListAllParent(List<String> parentName, File f1) {
        //当f1的上级目录不为空的时候  则打印这个List数组集合
        if (!"".equals(f1.getParentFile().getName())) {
        parentName.add(f1.getParentFile().getName());
        }
        //当f1上级目录不为空的时候，则获取他的上级目录
        if (f1.getParentFile().getParentFile()!=null) {
            ListAllParent(parentName,f1.getParentFile());
        }
    }
}
