//保证关闭资源的finally语句块！
package 语言核心;

import java.util.Scanner;

public class P232 {
    public static void main(String[] args) {
        try{
            String nu1,nu2;
           Scanner sc=new Scanner(System.in);
            System.out.println("请输入除数：");
            nu1=sc.nextLine();
            System.out.println("请输入被除数：");
            nu2=sc.nextLine();
            int n1=Integer.valueOf(nu1);
            int n2=Integer.valueOf(nu2);
            double n3=n1/n2;
            System.out.println("本计算得出的商为："+n3);
        }catch(ArithmeticException e){
            e.toString();
            System.out.println("算数异常除数为0！");
        }
        catch(NumberFormatException e){
            e.toString();
            System.out.println("数据类型转换异常！");
        }
        catch(Exception e){
            e.toString();
            System.out.println("发生未知错误！");
        }
        finally{
            System.out.println("本次计算完毕！");
        }  
    }
}
