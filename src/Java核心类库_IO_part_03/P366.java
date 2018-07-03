package Java核心类库_IO_part_03;
//IO-Properties类加载资源文件

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class P366 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //创建properties类对象
        Properties p=new Properties();
        //不能直接设置绝对路径 因为Windows有盘符的概念 一般部署的话是在Linux上面部署 所以部署是在相对路径上面而并非绝对路径！
        File f1=new File("D:\\dos编译","db.properties");
        FileInputStream input=new FileInputStream(f1);
        //加载输入流中的数据！ 加载之后数据都在P对象中
        p.load(input);
        System.out.println(p);
        //getProperties(String key)使用此属性列表中指定的键搜索属性。根据相关字段去寻找属性！ 
        System.out.println("账号："+p.getProperty("username"));
        System.out.println("密码："+p.getProperty("password"));
    }
}
