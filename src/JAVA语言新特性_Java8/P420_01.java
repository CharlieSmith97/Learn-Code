package JAVA语言新特性_Java8;

public interface P420_01 {
    abstract void Swim();
    //接口中默认的方法 并非抽象！
    default void breathInwater(){
        System.out.println("我会游泳哦！");
    }
}
