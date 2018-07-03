package Java核心类库_集合框架part_02;

import java.util.HashSet;
import java.util.Set;

/*
     equals和HashCode方法
 */
public class P309_01 {

    public static void main(String[] args) {
        Set<Student>  s2=new HashSet<>();
        s2.add(new Student(1, "小A", 20));
        s2.add(new Student(2, "小B", 30));
        s2.add(new Student(3, "小C", 40));
        s2.add(new Student(4, "小D", 23));
        s2.add(new Student(5, "小E", 23));
        System.out.println(s2);
        System.out.println("数量："+s2.size());
    }
}

class Student {

    private int sn;
    private String name;
    private int age;

    public Student(int sn, String name, int age) {
        this.sn = sn;
        this.name = name;
        this.age = age;
    }
    public int getSn() {
        return sn;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" + "学号=" + sn + ",姓名" + name + ",年龄=" + age + '}';
    }

    /*
        对学号进行比较来做和理性判断 
        1：如果学号一致那么则可以得出重复输入的问题
        2：否则 则生成新的学生信息！
    */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.sn;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.sn != other.sn) {
            return false;
        }
        return true;
    }
    
}
