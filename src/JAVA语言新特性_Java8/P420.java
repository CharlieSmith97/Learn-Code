package JAVA语言新特性_Java8;
//Java8中的新特性-接口的默认方法（拥有具体的实现细节）！
public class P420 implements P420_01,P420_02 {
    public static void main(String[] args) {
        P420 forg=new P420();
        forg.Swim();
        forg.run();
        //不仅仅是可以实现接口中的抽象方法 也可以调用接口中的默认方法（java8 新特性）！
        forg.breathInRun();
        forg.breathInwater();
    }

    @Override
    public void Swim() {
        System.out.println("Sorry，我并没有尾巴！");
    }

    @Override
    public void run() {
        System.out.println("不好意思，我的腿并不长！我不是长腿欧巴！");
    }
}
