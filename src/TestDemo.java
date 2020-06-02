import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @ClassName: TestDemo
 * @Author: 邹双双
 * Date: 2020/6/2 17:07
 * @Description:
 */
public class TestDemo {
    public static void main(String[] args) {
       //String 是泛型参数
       //1、创建 Collection
        Collection<String> collection = new ArrayList<>();
        //2、使用Size方法
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.add("木木");
        collection.add("喜欢");
        collection.add("Java");
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));
        for (String s: collection) {
            System.out.println(s);
        }
    }
}
