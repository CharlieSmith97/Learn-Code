//饿汉式  声明对象的同时还要new出来！
package 核心类库_线程Part1;

public class P257 {
    /*
          private P257(){
      }
      //将对象私有化常量化 不需要创建对象就可以对该方法进行使用！
      private static final P257 instatnce=new P257(); 饿汉式
      private static P257 getinstance(){
          return instatnce;
      }
    public void sort(int[]arr){
        //TODO
        推荐使用饿汉式：简单 安全 粗暴
    }
    */
          private P257(){
      }
      //将对象私有化常量化 不需要创建对象就可以对该方法进行使用！
      private static volatile P257 instance=null;
      private static P257 getinstance(){
        if (instance==null) {
         //使用双重检查锁   线程进入getinstance的时候先判断是否存在然后再同步对象
         synchronized(P257.class){
            //如果instance如果为空的话，则创建一个新的instance赋给instance
              instance=new P257();         
             }                
          }
          return instance;
      }
          
    public void sort(int[]arr){
        //TODO
            
    }
}
