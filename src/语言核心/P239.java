//Java7中的异常新特性
package 语言核心;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class P239 {
        public static void main(String[] args){
            try {
                DoWork();
            } catch (FileNotFoundException e) {
                e.getMessage();
                System.out.println("指示尝试打开由指定路径名表示的文件失败!");
            }catch(Exception e){
                e.getMessage();
                System.out.println("出现未知错误！");
            }
        }
    private static void DoWork()throws FileNotFoundException{
        try {
               new FileOutputStream("");
               //FileNotFoundException
            } catch (Exception e) {
                e.printStackTrace();
                throw e;//继续抛给调用者 java6中想调用者抛异常的话只能抛出Exception 而Java7中可以相对应的异常类型  
            }
    }    
}
