import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        NumberFormat format = NumberFormat.getInstance();
        
        /* write */ labelGenerator.setNumberFormat(format);

        // Additional complexity with unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }
        
        Map<String, Integer> numberMap = new HashMap<>();
        for (Integer number : numbers) {
            numberMap.put("Number_" + number, number);
        }
        
        for (Map.Entry<String, Integer> entry : numberMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // More operations
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Original read operation
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();
        
        System.out.println("Formats are equal: " + retrievedFormat.equals(format));

        // Further complexity
        numbers.add(60);
        numbers.add(70);
        
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + ": " + numbers.get(i));
        }
    }
}