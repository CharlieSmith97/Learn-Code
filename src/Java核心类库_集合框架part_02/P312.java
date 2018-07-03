package Java核心类库_集合框架part_02;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
    按照年龄Person对象的年龄做自然排序
 */
public class P312 {

    public static void main(String[] args) {
        Set<person> s1 = new TreeSet<>();
        s1.add(new person("赵一", 22));
        s1.add(new person("李二", 32));
        s1.add(new person("王六", 98));
        //放在TreeSet中的对象必须实现Comparable接口
        System.out.println(s1);
        System.out.println("---------------------------------------------");
        //对对对象名称长短进行比较的一个自定义方法
        Set<person> s2=new TreeSet<>(new NameLengthComparTor());
        s2.add(new person("赵二", 22));
        s2.add(new person("李", 32));
        s2.add(new person("王五六", 98));
        System.out.println(s2);
    }
}
//创建一个名字长短比较器

class NameLengthComparTor implements Comparator<person> {
    @Override
    public int compare(person o1, person o2) {
        if (o1.name.length() > o2.name.length()) {
            return 1;
        } else if (o1.name.length() < o2.name.length()) {
            return -1;
        }
        return 0;
    }
}

class person implements Comparable<person> {

    protected String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" + "姓名=" + name + ", 年龄=" + age + '}';
    }

    //编写比较规则 对年龄进行排序 排序规则为升序！
    @Override
    public int compareTo(person other) {
        if (this.age > other.age) {
            return 1;
        } else if (this.age < other.age) {
            return -1;
        }
        return 0;
    }

}
