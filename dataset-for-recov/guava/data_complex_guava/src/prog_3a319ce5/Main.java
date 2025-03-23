import com.google.common.collect.HashRangeMap;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashRangeMap<Integer, String> rangeMap = HashRangeMap.create();
        /* write */ rangeMap.put(Range.closed(1, 10), "Value in range 1-10");
        
        // Additional unrelated complexity
        List<String> stringList = new ArrayList<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        for (int i = 0; i < 5; i++) {
            stringList.add("String " + i);
            hashMap.put(i, "Value " + i);
        }
        
        // Process the string list
        for (String str : stringList) {
            System.out.println(str);
        }
        
        // Process the hash map
        for (int key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
        
        /* read */ String value = rangeMap.get(5); // This value is retrieved from the range
        System.out.println(value);
        
        // Further unrelated complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}