//在P154上面的基础上进行代码优化 提供一个feed对不同类型的动物进行喂养操作
package Java面向对象part3;

public class P154_1 {
    public static void main(String[]args){
        pson s=new pson();
        dg d=new dg();
        s.eating(d);
    }
}
//---------------------分割线！-------------------------  
class pson{
    /*
        吃的方法里面传入的参数类型是父类的类型  所以此方法只需调用一次
    */
    public void eating(DW D){
        System.out.println("feding..................");
        D.eating();
        //胖段对象是否是某个的实例
        if(D instanceof dg){
            dg d=(dg)D;
            d.watch();
        }
        else if(D instanceof ct)
        {
            ct c=(ct)D;
            c.watchMouse();
        }
    }
}
//---------------------分割线！-------------------------
   class DW{
       public void eating(){
           System.out.println("吃一般的食物............");
       }
   }
   class ct extends  DW{
      @Override
       public void eating(){
           System.out.println("一定要吃鱼！");
   }
       public void watchMouse(){
           System.out.println("抓老鼠！");
       }
   }
    class dg extends  DW{
        @Override
        public void eating(){
            System.out.println("一定要吃肉！");
        }
        public void watch(){
            System.out.println("看门！");
        }
    }