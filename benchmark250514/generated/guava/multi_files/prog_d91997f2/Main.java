import com.google.common.collect.ImmutableMultimap;

public class Main {
    public static void main(String[] args) {
        // Create and use MultimapBuilder
        MultimapBuilder multimapBuilder = new MultimapBuilder();
        multimapBuilder.addEntry("key1", "value1");
        multimapBuilder.addEntry("key2", "value2");
        
        // Original write operation
        multimapBuilder.addEntry("key", "value");
        
        ImmutableMultimap<String, String> multimap = multimapBuilder.build();
        
        // Create and use DataStructures
        DataStructures dataStructures = new DataStructures();
        dataStructures.addToMultimap("anotherKey", "anotherValue");
        dataStructures.addToMap("one", 1);
        dataStructures.addToMap("two", 2);
        dataStructures.addToMap("three", 3);

        // Perform operations on the HashMap
        int sum = 0;
        for (Integer value : dataStructures.getMap().values()) {
            sum += value;
        }
        System.out.println("Sum of values in HashMap: " + sum);

        // Perform operations on the regular Multimap
        for (String key : dataStructures.getRegularMultimap().keySet()) {
            System.out.println("Values for " + key + ": " + dataStructures.getRegularMultimap().get(key));
        }

        // Original read operation
        /* read */ String value = multimap.get("key").iterator().next();
        System.out.println(value);

        // Additional unrelated operations
        dataStructures.addToMultimap("anotherKey", "additionalValue");
        for (String key : dataStructures.getRegularMultimap().keySet()) {
            System.out.println("Updated values for " + key + ": " + dataStructures.getRegularMultimap().get(key));
        }
    }
}