package Java核心类库_IO_part_03;
//打印流的格式化输出 prinf

public class P363 {
    public static void main(String[] args) {
        //打印一句话，显示风格（姓名：will，年龄：18）
        //格式化输出
        String name="小明";
        int age=20;
        String format="姓名：%s，年龄：%d";//输出格式
        Object[] data={"小明",20};//填充内容
        System.out.printf(format,data);
        System.out.println();
        //在printf中自定义输出样式
        System.out.printf("姓名：%s，年龄：%d","二狗子",30);
    }
}
