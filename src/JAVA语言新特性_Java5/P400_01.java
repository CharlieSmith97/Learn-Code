package JAVA语言新特性_Java5;
//可变参数
public class P400_01 {
    public static void main(String[] args) {
     P400 p1=new P400("手机",888,10);
     P400 p2=new P400("充电宝",50,12);
     P400 p3=new P400("内存条",900,13);
     //P400[] items={p1,p2,p3};
     Double sum=getTotalPrice(p1,p2,p3);
        System.out.println("你购买的商品总价格为："+sum+"元！");
     Double s1=getTotalPrice(0.8,p1,p2,p3);
        System.out.println("打折之后的价格为："+s1);
    }
    /*
        提供一个方法求出商品总价格！
    public static double getTotalPrice(P400[] items){
        double sum=0.0;
        for (int i = 0; i < items.length; i++) {
            根据循环求出每一个数组中索引的值
            P400 item=items[i];
            利用P400提供的返回数据的方法对总价进行计算！
            sum+=item.getPrice()*item.getNum();
            将每个单品商品的总价格叠加起来
        }
        return sum;   
    }
    */
    /*
        提供一个可变参数的的方法 其实编译后的方法就和前面注释的方法是一样的！ 
        可以传入数组对象的同时 也可以直接丢数组进去进行计算！增强了该方法的可拓展性
        但是其实通过反编译工具查看的话就是一个语法糖！ 方便了程序员对于数组对象的处理！
        （代码可以直接传入方法中直接拓展！不需要调用动态数组来完成这一操作！）
        可变参数必须作为方法的最后一个参数而存在！为了避免参数的歧义！
    */
    public static double getTotalPrice(P400... items){
        double sum=0.0;
        for (int i = 0; i < items.length; i++) {
            //根据循环求出每一个数组中索引的值
            P400 item=items[i];
            //利用P400提供的返回数据的方法对总价进行计算！
            sum+=item.getPrice()*item.getNum();
            //将每个单品商品的总价格叠加起来
        }
        return sum;   
    }
    //设定一个打折的总价计算！
    public static double getTotalPrice(Double db,P400... items){
        double sum=0.0;
        for (int i = 0; i < items.length; i++) {
            //根据循环求出每一个数组中索引的值
            P400 item=items[i];
            //利用P400提供的返回数据的方法对总价进行计算！
            sum+=item.getPrice()*item.getNum();
            //将每个单品商品的总价格叠加起来
        }
        return sum*db;   
    }
}
    /*
    缺点：
    上述的代码解决了多个商品价格总价的问题！
    但是如果商品数量（P400 参数列表）不确定的时候，那怎么计算总价呢？
         方案1：
            启用动态集合
            List<P400> list=new ArrayList<>();
            然后把需要计算的总价的P400对象存储到list中来
            调用list.toArray方法把集合转换为数组，但是转换之后的数组是Object类型的，还得对Object数组还得做强制转换 太麻烦了！   
          方案2：
            对同一种类型参数不确定的情况下的问题，我们可以使用方法的可变参数来解决！   
            启用可变参数
                结论：方法的可变参数其本质，就是数组
    */