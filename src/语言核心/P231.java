package 语言核心;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class P231 {
    public static void main(String[] args) {
        System.out.println("Action………………！");
        Scanner sc=new Scanner(System.in);
        String sNum1,sNum2;//用户输入的被除数！
        try {
        System.out.println("请输入你的除数：");
        sNum1 =sc.nextLine();
        System.out.println("请输入你的被除数：");
        sNum2=sc.nextLine();
        //将String转换为int类型
        int num1=Integer.parseInt(sNum1);
        int num2=Integer.parseInt(sNum2);
        double z=num1/num2;
        System.out.println("两数相除得出的商为:"+"\n"+z);
        }
        /*
        catch(ArithmeticException e){
            e.toString();
            JOptionPane.showMessageDialog(null,"出现算数异常!" );//可以选择以弹窗的方式提醒用户异常的发生！
            //System.out.println("出现算数异常！");
        }catch(NumberFormatException e){
            e.toString();
            JOptionPane.showMessageDialog(null,"数据类型转换出现异常！很抱歉！");
            //System.out.println("数据类型转换出现异常！很抱歉！");
        }
        */
        
        /*
        Java7中的多异常捕获！  但是和之前的差不多  但从细节上来分析的话可以使用多个catch来做异常捕获！
        多异常捕获不能和父类Exception进行比较！
        (final ArithmeticException|NumberFormatException e)
        */
        catch(ArithmeticException|NumberFormatException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.toString();
            JOptionPane.showMessageDialog(null,"出现未知错误！");
            //System.out.println("出现未知错误！");
        }
        System.out.println("Ending………………!");
        System.out.println("结束完毕！");
        System.exit(0);
    }
}   
    /*
        run:
    Action………………！
    请输入你的除数：
    sb123
    请输入你的被除数：
    123
    Ending………………!
    结束完毕！
    成功构建 (总时间: 7 秒）
    基于类型转换出现的异常！
    ---------------------------
    run:
    Action………………！
    请输入你的除数：
    123
    请输入你的被除数：
    0
    Ending………………!
    结束完毕！
    成功构建 (总时间: 7 秒)
    及预算数问题出现的异常！
    */
