package Java核心类库_集合框架part_02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P316 {
    public static void main(String[] args) {
        //Map 泛型里面Stirng一般来讲的话是名称，Object来讲的话存储的是数据！
        Map<String,Object> mp=new HashMap();
        mp.put("Key1", 1);
        mp.put("Key2", 2);
        mp.put("Key3", 3);
        mp.put("Key4", 4);
        System.out.println(mp);
        mp.put("Key4", 5);
        System.out.println("覆盖后：");
        System.out.println(mp);
        //此映射是否包含Key的映射
        System.out.println(mp.containsKey("Key1"));
        //此映射是否包含Value的映射
        System.out.println(mp.containsValue(1));
        
        //根据Key查找Value 因为Key是唯一的！传入Key的名称之后得出的结果为对应Key的Value值！
        Object val1=mp.get("Key4");
        System.out.println("对应Key值为Key4的Value值："+val1);
        System.out.println("MP对象mp里面所包含的键入值数量为："+mp.size());
        mp.remove("Key4");
        System.out.println(mp);//对映射列表作删除操作 删除的不仅仅是Key值，而是随之相对应的Value的值！
        Set<String> ky=mp.keySet();
        for (Object object : ky) {
            System.out.println(object+"对应的Value值：---->"+mp.get(object));
        }
        System.out.println("------------------------------------------------!");
        //获取Map中所有的Value组成的集合（Value可以重置，类似于List）
        Collection<Object> vs=mp.values();
        for (Object v : vs) {
            System.out.println(v);
        }
        System.out.println("------------------------------------------------!");
        //Entry:获取Map中所有的键值对！
        Set<Map.Entry<String,Object>> Ety=mp.entrySet();
        for (Map.Entry<String, Object> entry : Ety) {
            //System.out.println(entry);
            String keys=entry.getKey();
            Object Values=entry.getValue();
            System.out.println(keys+"---"+Values); 
        }//如果需要对Key值进行更改的话：只需要重新调用put传入相同Key名称，然后传入自己所需元素对该Key名称的Value只进行覆盖操作！
    }
}
