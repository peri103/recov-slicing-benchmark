import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableList since ImmutableList does not support direct mutation
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Some additional unrelated complex operations
        ArrayList<Integer> tempList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < 5; i++) {
            tempList.add(i * 10);
            map.put("key" + i, i * 100);
        }
        
        // Use the map for some computations
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        
        System.out.println("Sum from map: " + sum);
        
        /* write */ builder.add(1);
        
        // Build the immutable list
        ImmutableList<Integer> list = builder.build();
        
        // Another set of operations before reading
        for (int i = 0; i < tempList.size(); i++) {
            System.out.println("TempList item: " + tempList.get(i));
        }

        // Use the ImmutableList
        /* read */ int value = list.get(0);
        
        System.out.println("Read value: " + value);
        
        // More complex logic
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ImmutableList item: " + list.get(i));
        }
    }
}