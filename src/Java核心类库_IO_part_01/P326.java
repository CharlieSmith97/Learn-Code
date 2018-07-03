package Java核心类库_IO_part_01;

import java.io.File;

    /**
     * File介绍和路径分隔符
     *  系统平台分隔符
     *  
     */
public class P326 {
    public static void main(String[] args) {
       /*
        Modifier and Type Field and Description 
        static String pathSeparator 
        与系统相关的路径分隔符字符，为方便起见，表示为字符串。  
        static char pathSeparatorChar 
        与系统相关的路径分隔符。  
        static String separator 
        与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。  
        static char separatorChar 
        与系统相关的默认名称分隔符。  
        */ 
       
       // Unix：获取属性分隔符
       String pathSeparator=File.pathSeparator;
       char pathSeparatorChar=File.pathSeparatorChar;
        System.out.println(pathSeparator+"\t"+pathSeparatorChar);
        
        // Unix：获取路径分隔符
        String Sep1=File.separator;
        char Sep2=File.separatorChar;
        System.out.println(Sep1+ "\t"+Sep2);
        
        //表示一个文件的路径
        String s1="G:\\will\\123.txt";
        String s2="G:/will/123.txt";//推荐
        String s3="G:"+File.separator+"will+"+File.separator+"123.txt";//带跨平台语言！  
    }
}
