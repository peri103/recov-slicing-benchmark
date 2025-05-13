import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Map<String, Color> sectionColors = new HashMap<>();
        
        // Set colors for multiple sections
        sectionColors.put("Section1", Color.RED);
        sectionColors.put("Section2", Color.BLUE);
        sectionColors.put("Section3", Color.GREEN);
        
        for (Map.Entry<String, Color> entry : sectionColors.entrySet()) {
            plot.setSectionPaint(entry.getKey(), entry.getValue());
        }
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);

        // Manipulate section colors
        sectionColors.put("Section4", Color.YELLOW);
        sectionColors.put("Section5", Color.ORANGE);
        
        // Retrieve and print colors for sections
        for (String section : sectionColors.keySet()) {
            Color color = plot.getSectionPaint(section);
            System.out.println("Color for " + section + ": " + color);
        }
        
        // Original write-read pair
        /* write */ plot.setSectionPaint("Section1", Color.RED);
        
        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 integers: " + product);

        // Retrieve and print the original section color
        /* read */ Color sectionPaint = (Color) plot.getSectionPaint("Section1");
        System.out.println("Original Section1 color: " + sectionPaint);
        
        // More complex manipulations
        for (Map.Entry<String, Color> entry : sectionColors.entrySet()) {
            if (entry.getValue() == Color.RED) {
                plot.setSectionPaint(entry.getKey(), Color.PINK);
            }
        }
        
        // Print final colors
        for (String section : sectionColors.keySet()) {
            Color finalColor = plot.getSectionPaint(section);
            System.out.println("Final color for " + section + ": " + finalColor);
        }
    }
}