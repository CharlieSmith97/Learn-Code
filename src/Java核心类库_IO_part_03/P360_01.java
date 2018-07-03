package Java核心类库_IO_part_03;
// 需要序列化的对象  需要实现该接口：Serializable

        import java.io.Serializable;
public class P360_01 implements Serializable {
    /*
    private static final long SerialversionUID=123123123;
    自己可以设定一个版本号 固定版本号
    无论类里面的字段怎么样改变
    版本号是不会变的！
    */
    private String name;
    private String password;
    private int age;

    public P360_01(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "P360_01{" + "姓名=" + name + ",密码=" + password + ", 年龄=" + age + '}';
    }
}
