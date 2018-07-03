//引出抽象方法设计
package Java面向对象part4;

public class P171 {
    public static void main(String[]args){
        //new circle(10).getRrea();用匿名对象调用该方法然后打印结果！
        circle c1=new circle(10);
        c1.say();
        Rectangle R1=new Rectangle(20,50);
        R1.say();
        triangle t1=new triangle(3,4,5);
        t1.say();
    }
}
 abstract class   Graph{
   abstract public double getRrea();//抽象类里面的抽象方法
   abstract  public void say();
}
    /*
        缺点： 每一个图形都有面积，所以在Graph类中定义求面积的方法getRrea没问题。
        但是，不同的具体的图形求面积的算法是不一样的，也就是说，每一个图形的子类都比须去覆盖getRrea（）方法。
        如果不覆盖该方法应该语法报错，所以应该覆盖！
        2：在图形类中定义了getRrea（）方法，不应该存在方法体（该方法不应该返回值）,因为不同子类求面积的方法不同。
    */
    //创建一个圆的类
class circle{
    private Integer r;
    circle(Integer r){
        this.r=r;
    }
    public int getR(){
        return r;
    }
    public double getRrea(){
        return Math.PI*r*r;
    }
    public void say(){
        System.out.println("该圆的半径:"+this.getR()+"\n面积为："+this.getRrea()+"\n-------------计算结束！--------------"); 
    }
}

    //创建一个矩形类
 class Rectangle{
     private Integer width;
     private Integer height;
     public Rectangle(Integer width,Integer height){
         this.height=height;
         this.width=width;
     }
     public int getW(){
        return width;
     }
     public int getH(){
        return height;
 }
     public double getRrea(){
        return height.doubleValue()*width.doubleValue();
     //计算结果的时候将int类型转为double类型  参数对象.类型Value（）; 将之前定义好的类型转为自己结果所需的类型
     }
     public void say(){
         System.out.println("长方形的长："+this.getW()+"\n宽为："+this.getH()+"\n面积为："+this.getRrea()+"\n-------------计算结束！--------------");
     }
 }
    class triangle extends Graph{
        private Integer a;
        private Integer b;
        private Integer c; 
        public triangle(Integer a,Integer b,Integer c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public double getA(){
            return a;
        }
        public double getB(){
            return b;
        }
        public double getC(){
            return c;
        }
        public  double  getRrea(){
           return Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));//可以利用海伦公式 return a*b/2;
            
        }
        public void say(){
        System.out.println("这个三角形，第一条边为："+this.getA()+"\n第二条边为："+this.getB()+"\n第三条边为："+this.getC()+"\n三角形面积为："+this.getRrea()+"三角形周长："+(a+b+c));
        System.out.println("-------------计算结束！--------------");
        }
    }
