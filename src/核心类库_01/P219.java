//验证码的创建
package 核心类库_01;

import java.util.Random;
import java.util.UUID;

public class P219 {
    public static void main(String[] args) {
        String code=UUID.randomUUID().toString().substring(0,5);//截取从一到五位的字符 并且转换为字符串
        System.out.println(code);
        System.out.println("---------------------------------------");
        String St="ABCASDKJKXC";
        St+=St.toLowerCase();
        St+="0123456789";
        System.out.println(St);
        //生成Random从0到St最后一位的长度的范围做随机输出运算！
        StringBuilder sb=new StringBuilder(5);//设定StringBuilder的长度为5
       for(int i=0;i<5;i++){
       char ch=St.charAt(new Random().nextInt(St.length()));//获取一次随机数 范围是st字符串里的 从0到9
        sb.append(ch);
        //打印一次就将ch加入到StringBuilder的字符串中
       }
        //最后输出的时候输出循环五次后的Stringbuilder的组合字符串       
        System.out.println(sb);
    }
}
