package JAVA语言新特性_Java5;

public class P406_01 {
    public static void main(String[] args) {
        P406_03 p1=new P406_03();
        p1.setRestDay(P406_02.Fri);
        System.out.println(p1.getRestDay());
        if (p1.getRestDay()==P406_02.Sta||p1.getRestDay()==P406_02.Sun) {
            System.out.println("放假时间到了！");
        }else{
            System.out.println("周一至周五上班时间！");
        }
        System.out.println("----------------------------------------");
        System.out.println(P406_02.Sun.name());//枚举常量名称
        System.out.println(P406_02.Sun.ordinal());//枚举常量枚举类型中的序列号！
        /*
            枚举类是不能够new的 是很安全的！ 是不能够创建相对应的对象的！
            因为枚举是不存在无参数构造器的！
            并且在设计模式中的时候 用枚举做单例的话是最安全的！
            枚举的特点：
                1.类型是最安全的，因为除了枚举之外protected或者是Private都是可以利用反射的特性进行获取相对应的信息！甚至是使用反射也不能创建对象
                2.可以使用name或者ordianl返回枚举对象的实例名称或者序数（从0开始）！
                3.所有的枚举类，都有一个vaules（）可以获取当前枚举类中所有的实例！ 可以利用迭代（foreach）迭代enum枚举类数组！
                4.所有的枚举都有静态方法valueOf可以把String类型的字符串，转换为指定枚举类型的枚举常量！
                5.枚举常量必须先声明，并且常量之间用逗号隔开，最后一个长量之间需要用到分号隔开！（Java代码编写规范！）
                6.枚举类常量值后若使用{}，则表示当前枚举类使用的是匿名内部类！ 一样可以通过Xjad反编译可以得出！
                switch（语句）{
                
                }
                switch支持的类：byte，short，char，int注意没有long！ switch（支持int类型但是long转换类型的话可能会损失精度！）
                因为Java5开始有自动装箱和自动拆箱：所以也支持Byte，Short，Character，Integer；也支持枚举类型！
        */
        System.out.println("----------------------------------------");
        System.out.println("打印所有的实例对象！");
        P406_02[] days=P406_02.values();
        for (P406_02 p406_02 : days) {
            System.out.println("实例："+p406_02);
        }
        System.out.println("----------------------------------------");
        P406_02 day=P406_02.valueOf("Sun");
        System.out.println(day);
        System.out.println("----------------------------------------");
        /*
        switch(day){
        Mon,Tue,Wen,Thu,Fri,Sta,Sun;
            case Fri:
            break;
            case Mon:
            break;
            case Sta:
            break;
            case Thu:
            break;
            case Tue:
            break;
            case Wen:
            break;
            case Sun:
            break;
        }
        */
    }
}
