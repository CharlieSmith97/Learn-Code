package JAVA语言新特性_Java8;

public class P415_01 {
    public static void main(String[] args) {
        new P415_01().test();
    }
    public void grapWork(P415 p){
        System.out.println("Do some grapWork! ");
        p.Dowork();
    }
    /*
        因为如果用lambda表达式来简化接口，那么接口只能有一个抽象类 
    */
    public void test(){
      this.grapWork(()->System.out.println("Do real work!"));
    }
}

