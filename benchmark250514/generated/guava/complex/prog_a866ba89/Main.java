import com.google.common.collect.MutableClassToInstanceMap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MutableClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        // Create an instance of a class to store
        String instance = "Hello, World!";
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alpha");
        arrayList.add("Beta");
        arrayList.add("Gamma");
        
        // Perform operations on HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
        
        // Perform operations on ArrayList
        for (String element : arrayList) {
            System.out.println("Element: " + element);
        }
        
        /* write */ map.putInstance(String.class, instance);
        
        // Additional operations
        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in HashMap: " + sum);
        
        String concatenatedString = "";
        for (String element : arrayList) {
            concatenatedString += element + " ";
        }
        System.out.println("Concatenated String: " + concatenatedString.trim());
        
        /* read */ String retrievedInstance = map.getInstance(String.class);
        
        System.out.println(retrievedInstance);
    }
}