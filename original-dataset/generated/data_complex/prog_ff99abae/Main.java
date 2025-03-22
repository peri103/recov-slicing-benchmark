import java.util.Vector;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        Vector<String> stringVector = new Vector<>();
        HashMap<Integer, String> map = new HashMap<>();
        
        // Add elements to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        // Add elements to the string vector
        stringVector.add("Hello");
        stringVector.add("World");
        
        // Perform operations on the map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Add more elements to the vector
        for (int i = 0; i < 5; i++) {
            vector.add(i * 10);
        }
        
        /* write */ vector.add(42);
        
        // Perform operations on the string vector
        for (String str : stringVector) {
            System.out.println("String Vector Element: " + str);
        }
        
        // More operations on the vector
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Vector Element: " + vector.get(i));
        }
        
        /* read */ int value = vector.get(5);
        System.out.println("Read Value: " + value);
        
        // Additional operations to increase complexity
        stringVector.add("Java");
        stringVector.add("Programming");
        
        for (String str : stringVector) {
            System.out.println("Updated String Vector Element: " + str);
        }
    }
}