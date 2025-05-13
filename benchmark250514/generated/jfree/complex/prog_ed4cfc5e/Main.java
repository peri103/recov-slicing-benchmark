import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        PiePlot plot2 = new PiePlot();
        
        // Setting a different property on plot2
        plot2.setLabelBackgroundPaint(Color.RED);
        Paint paint2 = plot2.getLabelBackgroundPaint();
        System.out.println("Label Background Paint of plot2: " + paint2);
        
        // Using a HashMap to store some data
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("A", 10);
        dataMap.put("B", 20);
        dataMap.put("C", 30);
        
        // Iterating over the map
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (Integer value : dataMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);
        
        // Setting the label background paint for the original plot
        /* write */ plot.setLabelBackgroundPaint(Color.BLUE);
        
        // More unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Retrieving the label background paint for the original plot
        /* read */ Paint paint = plot.getLabelBackgroundPaint();
        System.out.println("Label Background Paint of plot: " + paint);
        
        // Additional logic
        if (paint.equals(Color.BLUE)) {
            System.out.println("The label background paint is set to BLUE.");
        } else {
            System.out.println("The label background paint is not BLUE.");
        }
    }
}