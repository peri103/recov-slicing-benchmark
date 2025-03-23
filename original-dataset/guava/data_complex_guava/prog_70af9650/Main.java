import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Builder<Integer, Integer, String> builder = ImmutableTable.builder();
        /* write */ builder.put(1, 2, "Hello");
        ImmutableTable<Integer, Integer, String> table = builder.build();
        
        // Additional unrelated code for complexity
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        stringList.add("World");
        stringList.add("Java");
        hashMap.put(1, "First");
        hashMap.put(2, "Second");
        
        // More unrelated operations
        for (String str : stringList) {
            System.out.println("String from list: " + str);
        }
        
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
        
        /* read */ String value = table.get(1, 2);
        System.out.println(value);
        
        // Further unrelated code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}