import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DateAxis dateAxis = new DateAxis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        // Create an ArrayList and add some elements
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        // Create a HashMap and populate it
        HashMap<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 1);
        fruitMap.put("Banana", 2);
        fruitMap.put("Cherry", 3);

        // Perform some operations on the ArrayList
        for (String fruit : stringList) {
            System.out.println("Fruit: " + fruit);
        }

        // Access and print a value from the HashMap
        System.out.println("Value for 'Banana': " + fruitMap.get("Banana"));

        /* write */ 
        dateAxis.setDateFormatOverride(dateFormat);

        // More operations on the ArrayList
        if (stringList.contains("Banana")) {
            System.out.println("Banana is in the list.");
        }

        // Modify the HashMap
        fruitMap.put("Date", 4);
        System.out.println("Value for 'Date': " + fruitMap.get("Date"));

        // Final operations
        /* read */ 
        SimpleDateFormat readDateFormat = (SimpleDateFormat) dateAxis.getDateFormatOverride();
        
        System.out.println("Date format pattern: " + readDateFormat.toPattern());

        // Additional logic to make the program more complex
        int sum = 0;
        for (Integer value : fruitMap.values()) {
            sum += value;
        }
        System.out.println("Sum of all values in the map: " + sum);
    }
}