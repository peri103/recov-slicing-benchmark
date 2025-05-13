import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a Guava Table
        Table<String, String, Integer> table = HashBasedTable.create();
        
        // Initialize a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Key1", 100);
        hashMap.put("Key2", 200);
        
        // Initialize an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(300);
        arrayList.add(400);
        
        // Use the Guava Table's put method
        /* write */ table.put("Row1", "Column1", 42);
        
        // Perform operations on HashMap
        int mapValue = hashMap.get("Key1");
        System.out.println("HashMap Value: " + mapValue);
        
        // Perform operations on ArrayList
        int listValue = arrayList.get(0);
        System.out.println("ArrayList Value: " + listValue);
        
        // More operations on HashMap
        hashMap.put("Key3", 300);
        hashMap.put("Key4", 400);
        
        // More operations on ArrayList
        arrayList.add(500);
        arrayList.add(600);
        
        // Use the Guava Table's get method
        /* read */ Integer value = table.get("Row1", "Column1");
        System.out.println("Table Value: " + value);
        
        // Iterate over HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }
        
        // Iterate over ArrayList
        for (Integer num : arrayList) {
            System.out.println("ArrayList Element: " + num);
        }
    }
}