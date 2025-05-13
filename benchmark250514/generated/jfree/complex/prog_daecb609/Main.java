import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        PiePlot plot2 = new PiePlot();
        
        // Setting up a map to store section names and their colors
        Map<String, Color> sectionColors = new HashMap<>();
        sectionColors.put("Section1", Color.RED);
        sectionColors.put("Section2", Color.BLUE);
        sectionColors.put("Section3", Color.GREEN);

        // Applying colors to sections in plot2
        for (Map.Entry<String, Color> entry : sectionColors.entrySet()) {
            plot2.setSectionOutlinePaint(entry.getKey(), entry.getValue());
        }

        // More complex operations
        int counter = 0;
        for (String section : sectionColors.keySet()) {
            if (counter % 2 == 0) {
                plot2.setSectionOutlinePaint(section, Color.YELLOW);
            }
            counter++;
        }

        /* write */ plot.setSectionOutlinePaint("Section1", Color.RED);

        // Simulating some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);

        // Checking colors in plot2
        for (String section : sectionColors.keySet()) {
            Color color = (Color) plot2.getSectionOutlinePaint(section);
            System.out.println("Section: " + section + ", Color: " + color);
        }

        /* read */ Color outlinePaint = (Color) plot.getSectionOutlinePaint("Section1");
        System.out.println("Outline paint for Section1 in plot: " + outlinePaint);

        // Additional complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 integers: " + product);
    }
}