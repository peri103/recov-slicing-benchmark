import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the HashSetValuedHashMap
        HashSetValuedHashMap<String, String> map = new HashSetValuedHashMap<>();
        HashSetValuedHashMap<Integer, String> additionalMap = new HashSetValuedHashMap<>();
        HashSetValuedHashMap<String, Integer> reverseMap = new HashSetValuedHashMap<>();

        // Additional write operation on a different map
        additionalMap.put(1, "Alpha");
        additionalMap.put(2, "Beta");

        // Write operation: put a key-value pair into the main map
        /* write */ map.put("key1", "value1");

        // Add more entries to the main map
        map.put("key2", "value2");
        map.put("key3", "value3");

        // Perform operations on the reverse map
        reverseMap.put("A", 100);
        reverseMap.put("B", 200);
        reverseMap.put("C", 300);

        // Retrieve all keys from the reverse map
        java.util.Set<String> reverseMapKeys = reverseMap.keySet();
        System.out.println("Reverse map keys: " + reverseMapKeys);

        // Iterate through the additional map and print its entries
        for (Integer key : additionalMap.keySet()) {
            System.out.println("Additional map entry: Key = " + key + ", Values = " + additionalMap.get(key));
        }

        // Perform calculations using the reverse map
        int sum = 0;
        for (Integer value : reverseMap.values()) {
            sum += value;
        }
        System.out.println("Sum of reverse map values: " + sum);

        // Read operation: retrieve the value associated with the key in the main map
        /* read */ java.util.Set<String> values = map.get("key1");

        // Print the value to verify correctness
        System.out.println("Read values from main map: " + values);

        // Perform additional operations on the main map
        if (map.containsKey("key2")) {
            System.out.println("Main map contains key2: " + map.get("key2"));
        }

        // Remove an entry from the main map
        map.remove("key3");
        System.out.println("Main map after removing key3: " + map);
    }
}