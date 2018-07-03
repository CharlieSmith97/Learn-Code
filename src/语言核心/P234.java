//返回错误结果----throw语句
package 语言核心;

import javax.swing.JOptionPane;

public class P234 {
    public static void main(String[] args) {
        System.out.println("ABCDEF".charAt(0));
        //返回索引位置对应的值！
        /*
            public char charAt(int index) {
        if ((index < 0) || (index >= value.length)) {
            throw new StringIndexOutOfBoundsException(index);
            字符串索引越界则返回一个数组越界的异常给调用者！
        }
        return value[index];
    }
        */
        try{
        int ret = divide(10, 0);//直接利用异常对象对象点PrintStackTrace()定位错误的信息位置！
        }catch(ArithmeticException e){
            e.printStackTrace();
            //System.out.println("除数不能为零！");
            JOptionPane.showMessageDialog(null,e.getMessage());
            /*
                利用弹窗让客户能更直观的看到错误所在！
                但是Java的图形化界面还有待改善！
            */
        }
    }

    private static int divide(int num1, int num2) {
        System.out.println("Begin………………");
        if (num2 == 0) {
            System.out.println("很抱歉！除数不能为零！请重新输出值进行计算！");
            throw new ArithmeticException("算数异常！除数不能为零！");
            //相当于用return返回一个值 但是throw是返回一个错误！算数异常为运行异常 可处理可不处理！
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
