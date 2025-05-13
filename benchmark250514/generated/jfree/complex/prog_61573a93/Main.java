import org.jfree.chart.ChartPanel;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ChartPanel
        ChartPanel chartPanel = new ChartPanel(null);
        
        // Use the write method
        /* write */ chartPanel.setMouseWheelEnabled(true);
        
        // Additional code to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Populate the ArrayList
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        // Populate the HashMap
        for (int i = 0; i < numbers.size(); i++) {
            map.put("Key" + i, numbers.get(i));
        }
        
        // Process data from ArrayList and HashMap
        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value % 4 == 0) {
                System.out.println(key + " has a value divisible by 4: " + value);
            }
        }
        
        // Use the read method
        /* read */ boolean isEnabled = chartPanel.isMouseWheelEnabled();
        
        // Output the result
        System.out.println("Mouse wheel enabled: " + isEnabled);
        
        // Additional processing
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // More complex logic
        if (sum > 20) {
            System.out.println("The sum is greater than 20.");
        } else {
            System.out.println("The sum is 20 or less.");
        }
    }
}