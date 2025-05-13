import org.jfree.chart.labels.StandardXYToolTipGenerator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create an instance of StandardXYToolTipGenerator
        StandardXYToolTipGenerator generator = new StandardXYToolTipGenerator();

        // Create a NumberFormat instance
        NumberFormat numberFormat = NumberFormat.getInstance();

        // Create a HashMap to store some data
        HashMap<String, Integer> dataMap = new HashMap<>();
        dataMap.put("One", 1);
        dataMap.put("Two", 2);
        dataMap.put("Three", 3);

        // Use the write method to set the number format
        /* write */ generator.setNumberFormat(numberFormat);

        // Perform operations on the HashMap
        for (String key : dataMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + dataMap.get(key));
        }

        // Create an ArrayList to store some numbers
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }

        // Sum up the numbers in the ArrayList
        int sum = 0;
        for (Integer num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Use the read method to get the number format
        /* read */ NumberFormat retrievedFormat = generator.getNumberFormat();

        // Print the retrieved number format to verify it matches the set format
        System.out.println("NumberFormat equals: " + retrievedFormat.equals(numberFormat));

        // Further operations on the ArrayList
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println("Number at index " + i + ": " + numberList.get(i));
        }
    }
}