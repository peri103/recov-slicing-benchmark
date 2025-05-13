import org.apache.commons.collections4.list.NodeCachingLinkedList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        NodeCachingLinkedList<Integer> list = new NodeCachingLinkedList<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        /* write */ list.add(42);
        
        NodeCachingLinkedList<String> stringList = new NodeCachingLinkedList<>();
        stringList.add("Hello");
        stringList.add("World");

        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        
        for (String str : stringList) {
            System.out.println(str);
        }

        /* read */ int value = list.get(0);
        System.out.println("Value from list: " + value);
        
        System.out.println("Sum from map: " + sum);
        
        NodeCachingLinkedList<Double> doubleList = new NodeCachingLinkedList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);
        
        double product = 1.0;
        for (Double num : doubleList) {
            product *= num;
        }
        
        System.out.println("Product of doubleList: " + product);
    }
}