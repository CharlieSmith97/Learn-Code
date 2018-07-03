
package Java基本工具;

public class P208 {
    public static void main(String[] args) {
    //匿名创建对象new Math1(88, 99).setMAX();
        System.out.println("Action！");
        Math1 m1=new Math1();
        m1.setA(88);
        m1.setB(99);
        m1.setjs();
    }
}
 class Math1{
    private double a,b;
    public Math1(){
        System.out.println("记得穿入数值啊！");
    }
    public Math1(double a,double b){
        this.a=a;
        this.b=b;
    }
    public void setA(double a){
        this.a=a;
    }
    public double getA(){
        return a;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getB(){
        return b;
    }
    public void setjs(){
        System.out.println("依次传入两个值:\n最大值为："+Math.max(getA(), getB())+"\n最小值为："+Math.min(getA(), getB()));
    }
 }