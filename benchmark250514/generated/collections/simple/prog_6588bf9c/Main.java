import org.apache.commons.collections4.map.DefaultedMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the DefaultedMap with a default value
        DefaultedMap<Integer, String> map = new DefaultedMap<>("Default Value");
        
        // Write a key-value pair into the map
        /* write */ map.put(1, "Hello World");
        
        // Read the value associated with the key
        /* read */ String value = map.get(1);
        
        // Print the read value
        System.out.println(value);
    }
}