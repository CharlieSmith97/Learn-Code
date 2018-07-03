//引用类型转换与instanceof运算符
package Java面向对象part3;

public class P156 {
    public static void main(String[]args){
        Object obj="abc";
        System.out.println(obj instanceof Object);//判断obj是否是object的实例？
        System.out.println(obj instanceof String);//判断obj是否是String的实例？  是的话就直接返回出true 否则为false
        System.out.println(obj.getClass());//获取obj对象的真实类型
        System.out.println(obj.getClass()==String.class);//obj是否等于这一份String字节码
        System.out.println(obj.getClass()==Object.class);//false  
        /*如下：
                class pson{
              吃的方法里面传入的参数类型是父类的类型  所以此方法只需调用一次
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
        */
    }
}
