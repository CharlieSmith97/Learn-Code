// 面向接口编程： 多态的好处： 把实现类对象赋给接口类型变量，屏蔽了不同实现类之间的实现差异，从而可以做到通用编程。
// 案例：使用USB设备来工作
package Java面向对象part5;
public class P182 {
     public static void main(String[] args) {
         Mouse m=new Mouse();
        MainBoard o=new MainBoard();
        o.pluginIn(m);
        print p1=new print();
       MainBoard v=new MainBoard();
         v.aj(p1);
    }            /*
             MainBord.pluginIn(m);  这样直接利用别的类来调用该方法的话
             是因为调用swapData的方法是静态的,
             所以总的来讲的话可以直接利用类名点的方式来调用该方法  
            */
}
//创建一个USB鼠标类  并且遵循USB规范
  class Mouse implements IUSB{
      public void swapData(){
          System.out.println("鼠标在移动！");
      }
  }
//创建一个主板类 static设立的因为是静态变量所以可以直接调用该方法。
//把设备插入到主板中的功能，结束IUSB类型的对象
  class MainBoard{
      public  void pluginIn(Mouse M){
         M.swapData();
      } 
        /*
         public static void pluginIn(Mouse M){
         M.swap(m);
         }
        */   
      public void aj(print P){
          P.swapData();
      }
  }
//设置一个USB版本打印机类
    class print implements IUSB{
        public void swapData(){
            System.out.println("正在打印中请稍候！");
        }
    }
//制定一个USB规范
    interface IUSB{
        void swapData();
    }
  /*
    class MainBorder {
    private static IUSB[]usbs =new IUSB[6];数组里面可以放置六个设备
    private static int index=0;表示插入到第几个位置
    }
    把设备插入到主板中的功能，接受USB类型的对象
    public static void pluginIn(IUSB usb){
      if(index=usbs.length){
        system.out.println("插槽插满了！");
          return;
    }
     usbs[index]=usb;
     index++;
    }
    去除主板中的每一个USB设备，并且工作
    public static void doWork(){
     for(IUSB usb:usbs){
        if(usb!=null){
            usb.swapData();
        }
     }
    }
    public static void main(String[]args){
        MainBorder.pluginIn(new mouse());
    }
   */