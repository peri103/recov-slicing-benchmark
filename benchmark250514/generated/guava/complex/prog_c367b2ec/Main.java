import com.google.common.collect.LinkedListMultimap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        /* write */ multimap.put("key1", 100);
        
        arrayList.add(200);
        arrayList.add(300);
        hashMap.put("key2", arrayList);
        
        Integer valueFromHashMap = hashMap.get("key2").get(1);
        System.out.println("Value from HashMap: " + valueFromHashMap);
        
        int sum = 0;
        for (Integer num : arrayList) {
            sum += num;
        }
        System.out.println("Sum of elements in arrayList: " + sum);
        
        Integer valueFromArrayList = arrayList.get(0);
        System.out.println("First element in arrayList: " + valueFromArrayList);
        
        /* read */ Integer value = multimap.get("key1").get(0);
        System.out.println("Value from LinkedListMultimap: " + value);
        
        arrayList.add(400);
        hashMap.put("key3", arrayList);
        
        int product = 1;
        for (Integer num : hashMap.get("key3")) {
            product *= num;
        }
        System.out.println("Product of elements in HashMap's key3: " + product);
    }
}