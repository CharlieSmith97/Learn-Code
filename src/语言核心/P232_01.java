//如果finally有return语句，永远返回finally中的结果，避免该情况 测试方法！
package 语言核心;

public class P232_01 {
    public static void main(String[] args) {
        int ac=test3();
        System.out.println("输出结果为："+"\n"+ac);
    }
      private  static int test3(){
            int a=1;
            try{
               return 
                       a;//a的值在之前就确定了 
            }finally{
                ++a; //学会拆分
            }
        }
}
/*  int ac=test2();
        System.out.println("输出的结果为："+"\n"+ac);
    } 
    private static int test2() {
        try{
            return 1;
        }finally{
            return 100;
        }
    }
    结论：
    其中的return并不会直接输出try语句块中的语句，
    而是直接输出finally中的语句块！
    所以在try语句中写return是没有任何意义的！
*/
    