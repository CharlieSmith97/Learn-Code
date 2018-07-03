package Java高级进阶;
//实现任意数组的拷贝操作
import java.lang.reflect.Array;
import java.util.Arrays;

public class P396 {
    public static void main(String[] args) {
        /*
        Object obj = new int[]{1, 3, 5, 7, 9};
        //获取索引为2的元素
        int val = Array.getInt(obj, 2);
        System.out.println(val);
        Array.setInt(obj, 2, 100);
         */
        int[] i1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] i2 = new int[6];
        System.out.println(Arrays.toString(i2));
        arrCopy(i1, 3, i2, 1, 2);
        System.out.println(Arrays.toString(i2));
    }

    /**
     *
     * @param src 源数组
     * @param srcPos 源数组的起始位置
     * @param dest 目标数组
     * @param destPos 目标数组的起始位置
     * @param length 数量
     */
    public static void arrCopy(Object src, int srcPos, Object dest, int destPos, int length){
        //如果不是数组的话那么就会抛出相对应的异常！
        if (!src.getClass().isArray() || !dest.getClass().isArray()) {
            throw new ArrayStoreException("源和目标不能为null！");
        }
        if (src == null || dest == null) {
            throw new NullPointerException("源数组和目标数组不能为空！");
        }
        //因为这个里面的src以及dest不能访问数组中的length方法 但是可以调用静态方法 Array.getLength（）来获取数组对象的长度！
        if (srcPos < 0 || destPos < 0 || length < 0 || srcPos + length > Array.getLength(src) || destPos + length > Array.getLength(dest)) {
            throw new IndexOutOfBoundsException("索引越界！");
        }
        //源和目标的元素类型不相同的话则抛出相对应的异常！
        if (src.getClass().getComponentType() !=dest.getClass().getComponentType()) {
            throw new ArrayStoreException ("两个数组之间的类型必须相同相同！");
        }
        for (int index =srcPos; index <srcPos+length; index++) {
            //获取需要拷贝的元素
            Object val=Array.get(src, index);
            System.out.println(val);
            //给目标数组设置元素
            Array.set(dest,destPos,val);
            destPos++;
        }
    }
}
