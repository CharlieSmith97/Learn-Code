//处理异常的原则！
package 语言核心;

import java.io.IOException;

public class P240 {
    /**
     * 描述方法的功能：
     * @param  name:参数功能的体现
     * @return 返回的参数具体是什么
     * @throws IOException -如果****就抛出  IOException
     */
    public static void Dowork()throws IOException{
        
    }
    public static void main(String[] args) {
        String str=null;
        if(str!=null){
         System.out.println(str.length());   
        }
        System.out.println("正在结束！");
        System.exit(0);
    }
}
    /*  
    在自定义方法中的注释（与该方法注释时的文档注释保持一致）： 
     语言核心.​P240
    public static void Dowork() throws IOException
    描述方法的功能：
    返回:
    返回的参数具体是什么 
    抛出:
    IOException - -如果****就抛出 IOException
     */
