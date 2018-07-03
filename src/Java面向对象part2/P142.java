//判断一个点和圆的关系：
package Java面向对象part2;

public class P142 {
    public static void main(String[]args){
        point p=new point(3,4);
        circle c=new circle(5);
        int ret=c.judge(p);
        System.out.println(ret);
    }
}
    //创建一个圆类
class circle{
    private int r;
    circle(int r){
    this.r=r;
    }
    /*
    创建一个圆的判断方法，
    返回：
    1：表示在圆外
    0：表示在圆上
    -1：表示在圆内
    */
    public  int judge(point p){
    int  xxyy= p.getx()*p.gety()+p.gety()*p.gety();
    //对一个圆的判定条件
    int rr=this.r*this.r;
    if(xxyy>rr){
    return 1;
    }
    else if(xxyy<rr){
    return -1;
    }
    else{
    return 0;    
    }
    }
}

    class point{
    private int x;
    private int y;
    public point(int x,int y){
    this.x=x;
    this.y=y;
    }
    public int getx(){
     return x;
    }
    public int gety(){
     return y;
    }
}