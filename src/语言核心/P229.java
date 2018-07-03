//用try-catch捕获单个异常
package 语言核心;

public class P229 {
    public static void main(String[] args) {
        System.out.println("Begin。。。。。。。。。。。。。");
        int a=3,b=0;
        try {
            double c=a/b;
            //System.out.println("C的值为："+c);不会再去执行了 已经跳转了Exception语句了！
            System.out.println("C的值为："+c);
        }    
         catch (ArithmeticException e) {
            System.out.println("出现算数异常！"+e.getMessage());
        }
         catch (Exception e) {
            System.out.println("出现未知错误！"+e.getMessage());
        }
        finally{
            System.out.println("欢迎本次使用该软件！");
        }
            System.out.println("Ending。。。。。。。。。。。。");
    }
}   
        /*   
           抛出异常算术条件时抛出。 例如，“除以零”的整数会抛出此类的一个实例。
           也可以试着不用try-catch先报一次错然后在等待出错的异常查API 
           写出相应的错误所在！
           执行顺序 先对try里面的语句块做捕获！
           如果出现了一场name对应发生异常的语句则跳到异常里面去完成相应的异常提示！
           然后再一次往后输出
        */
        
