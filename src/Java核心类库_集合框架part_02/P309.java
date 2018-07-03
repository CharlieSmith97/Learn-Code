package Java核心类库_集合框架part_02;

import java.util.HashSet;
import java.util.Set;

/*
    equals方法和HashCode方法
 */
public class P309 {

    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add(new A());
        s1.add(new A());
        s1.add(new B());
        s1.add(new B());
        s1.add(new C());
        s1.add(new C());
        System.out.println(s1.toString());
        System.out.println(s1.size());
    }
}

class A {

    public boolean equals(Object obj) {
        return true;
    }
}

class B {

    public int hashCode() {
        return 1;
    }
}

class C {

    public boolean equals(Object obj) {
        return true;
    }

    public int hashCode() {
        return 2;
    }
}
    /*
            当对HashCode做判断时： 需要equals又需要HashCode 但是仅当只有HashCode的时候equals会出现两种情况 则有一个会不符合条件！
     */
