import org.jfree.chart.plot.PiePlot;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        // Adding some entries to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Adding some entries to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        
        // Manipulating the PiePlot object
        /* write */ plot.setSectionOutlinesVisible(true);
        
        // Performing operations on the map
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of map values: " + sum);
        
        // Performing operations on the list
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Performing some mathematical operations
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum of a and b: " + c);
        
        // Reading the PiePlot property
        /* read */ boolean isVisible = plot.getSectionOutlinesVisible();
        System.out.println("Section outlines visible: " + isVisible);
        
        // Additional operations
        map.put("four", 4);
        list.add("date");
        
        // Rechecking the map and list
        System.out.println("Updated map: " + map);
        System.out.println("Updated list: " + list);
    }
}