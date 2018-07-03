package JAVA语言新特性_Java5;
//Java5的新新特性-方法的可变参数
public class P400 {
        private String name; //商品名称  
        private Integer price;//商品价格
        private Integer num;//购买的数量
    //无参构造！  
    public P400() {
    }
        
    public P400(String name, Integer price, Integer num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    //在P400类中提供获取数据的方法，在对外类调用内部数据做计算的时候提供了便捷！
    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getNum() {
        return num;
    }
    //提供一个toString方法 大音响对应的商品信息输出数据！
        @Override
    public String toString() {
        return "P400{" + "商品名称：" + name + "\n 商品价格：" + price + "\n 商品购买数量：" + num + '}';
    }
}
