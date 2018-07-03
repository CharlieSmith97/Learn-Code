//自定义异常类  如果继承的类是RuntimeException的话 可处理或者可不处理异常！
package 语言核心;

public class P236_Exception  extends Exception{
    private static final long serialVersionUID=1L;
    public P236_Exception(){
        
    }
    public P236_Exception(String message){
        super(message);
    }
    
    /**
     * 
     * @param message  表示当前的异常的原因/信息
     * @param cause 
     */
    public P236_Exception(String message,Throwable cause){
        super(message,cause);
    }
}
