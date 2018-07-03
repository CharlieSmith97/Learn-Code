//分析模板方法设计模式
package Java面向对象part4;

public class P174 {
  public static void main(String[]args){
      System.out.println(new StringOperate1().getTotalTime());
      System.out.println(new IntOperate1().getTotalTime());
  }  
}
    //操作的模板类
  abstract class OperateTimeTemplate{
      //模板方法：总体算法的骨架
    final  public long getTotalTime(){
      //模板方法不能修改  不改变算法结构！    
          long Begin=System.currentTimeMillis();//开始时间
            //具体操作（留给子类去完成！）
            DoWork();
          long End=System.currentTimeMillis();//结束时间 
          long time=End-Begin;
          return time;
      }
    protected abstract  void DoWork();
  }
 class StringOperate1 extends  OperateTimeTemplate{
    protected void DoWork(){
         String str="";
         for(int i=0;i<10000;i++){
           //  System.out.println("连接了："+i+"次");
             str+=1;
         }
     }
 }
 class IntOperate1 extends OperateTimeTemplate{
     protected void DoWork(){
        int sum=0;
         for(int i=0;i<10000;i++){
           //  System.out.println("相加了："+i+"次");
             sum+=1;
         }
     }
 }