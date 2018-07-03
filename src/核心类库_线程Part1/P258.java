package 核心类库_线程Part1;

public class P258 {
    private P258(){
    
   }
 private static volatile P258 instance=null;
  public static P258 getInstance(){
    synchronized(P258.class){
      if(instance==null){
          instance=new P258();
      }}
      return instance;
    }
  public void sort(int []arr){
      
  }
}
