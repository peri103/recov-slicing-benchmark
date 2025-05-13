import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot
        PiePlot plot = new PiePlot();

        // Create and set label paint
        Paint labelPaint = new Color(255, 0, 0); // Red color
        /* write */ plot.setLabelPaint(labelPaint);

        // Additional complex operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 5);
        }

        Map<String, Integer> map = new HashMap<>();
        for (Integer number : numbers) {
            map.put("Key" + number, number);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Further operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Read the label paint back
        /* read */ Paint readLabelPaint = plot.getLabelPaint();
        System.out.println("Label Paint: " + readLabelPaint);

        // More complex operations
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add("String" + i);
        }

        for (String str : strings) {
            System.out.println(str);
        }

        // Final operations
        int product = 1;
        for (int num : numbers) {
            product *= num == 0 ? 1 : num; // Avoid multiplying by zero
        }
        System.out.println("Product of numbers: " + product);
    }
}