
package 核心类库_01;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class P218_01 {
    public static void main(String[] args) {
        ThreadLocalRandom random=ThreadLocalRandom.current();
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(34,179));//直接生成自己想要范围的随机数 从34到179之间的随机数 
        //UUID
        String id=UUID.randomUUID().toString();
        System.out.println(id);
    }
}
