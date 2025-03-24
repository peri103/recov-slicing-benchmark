import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMap.Builder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Builder<Integer, String> builder = ImmutableSortedMap.<Integer, String>naturalOrder();
        /* write */ builder.put(1, "One");
        ImmutableSortedMap<Integer, String> map = builder.build();
        
        // Additional unrelated code to increase complexity
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        arrayList.add("First");
        arrayList.add("Second");
        hashMap.put("Key1", 100);
        hashMap.put("Key2", 200);
        
        // Processing the array list
        for (String item : arrayList) {
            System.out.println("ArrayList item: " + item);
        }
        
        // Processing the hash map
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap entry: " + key + " -> " + hashMap.get(key));
        }
        
        /* read */ String value = map.get(1);
        System.out.println("Value from ImmutableSortedMap: " + value);
    }
}