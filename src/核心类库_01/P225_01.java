//一定要谨记 再开始的时候做正则表达式的时候 对表达式做设置的时候 要用两根反斜线
package 核心类库_01;

import java.util.Scanner;

public class P225_01 {
    public static void main(String[] args) {
        String info,into,insan;//设定输入的内容的字符串
        
        System.out.println("请输入一组电话号码（且电话号码不能为空！）：");
        Scanner sc=new Scanner(System.in);
        info=sc.nextLine();
        String regex_01="^1[3|4|5|7|8]\\d{9}$";
        //System.out.println(info.matches(regex));
        if (info.matches(regex_01)) {
            System.out.println("恭喜你输入的电话号码能注册！");
        } else {
            System.out.println("很抱歉你输入的电话号码有误！请稍候再试！");
        }
        System.out.println("-------------------------");
        System.out.println("请输入你的邮箱号（且邮箱号不能为空！）：");
        insan=sc.nextLine();
        String regex_02="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        if (insan.matches(regex_02)) {
            System.out.println("恭喜你邮箱输入正确！");
        } else {
            System.out.println("邮箱输入有误！请重新输入邮箱号！");
        }
        System.out.println("-------------------------");
        System.out.println("请输入你的ID（且ID号不能为空！）：");
        into=sc.nextLine();
        //貌似对身份证ID的验证正则表达式有点问题
        String regex_03="\\d{14}[[0-9],0-9xX]";
        if (into.matches(regex_03)) {
            System.out.println("你输入的ID正确！");
        } else {
            System.out.println("你输入的ID有误！请重新输入！");
        }
    }
}
