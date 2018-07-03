//声明抛出异常throws语句
package 语言核心;

public class P235 {

    public static void main(String[] args) {
            divide1(10, 0);
    }
    /*
        表示：本方法中不处理某种类型的异常，提醒调用者需要来处理该异常！ 
        向上层表示异常的抛出！  
        解决方法：
            1：继续在主方法里面抛出  最后会默认向JVM里面抛出 结果就是JVM会打印 PrintStackTrace
            2：使用trycatch的方法对异常进行捕获！
    */
    private static int divide1(int num1, int num2){
        System.out.println("Begin………………");
        if (num2 == 0) {
            System.out.println("很抱歉！除数不能为零！请重新输出值进行计算！");
            //throw new ArithmeticException("算数异常！除数不能为零！");
            //如果里面利用throw 抛出的是RuntimeException运行异常的话 那么异常可处理可不处理！
            throw new RuntimeException("算数异常！除数不能为零！");
            //相当于用return返回一个值 但是throw是返回一个错误！
        }
        System.out.println("-----------------------------------");
        try {
            int ret = num1 / num2;
            System.out.println("结果为：" + "\n" + ret);
            return ret;
        } catch (ArithmeticException e) {
            System.out.println("算数异常！");
            e.printStackTrace();
        } finally {
            System.out.println("结束运算！");
        }
        return 0;
    }
}
