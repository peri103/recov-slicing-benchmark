import org.apache.commons.collections4.set.ListOrderedSet;
import org.apache.commons.collections4.list.TreeList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ListOrderedSet<String> set = ListOrderedSet.listOrderedSet(new LinkedHashSet<String>());
        TreeList<Integer> numbers = new TreeList<>();
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Adding elements to TreeList
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 5);
        }
        
        // Adding elements to the HashMap
        wordCount.put("Hello", 1);
        wordCount.put("World", 2);
        
        /* write */ set.add("Hello, World!");
        
        // Manipulating TreeList
        numbers.add(50);
        numbers.remove(0);
        
        // Accessing and printing elements from TreeList
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + ": " + numbers.get(i));
        }
        
        // Accessing and printing elements from HashMap
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Count: " + entry.getValue());
        }
        
        /* read */ String value = set.get(0);
        System.out.println(value);
        
        // Additional operations on ListOrderedSet
        set.add("Another String");
        set.remove("Hello, World!");
        
        // Printing all elements in ListOrderedSet
        for (String element : set) {
            System.out.println("Set element: " + element);
        }
    }
}