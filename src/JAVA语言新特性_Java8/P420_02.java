package JAVA语言新特性_Java8;

public interface P420_02 {
   abstract void run();
   default void breathInRun(){
       System.out.println("我还会跳！");
   } 
}
