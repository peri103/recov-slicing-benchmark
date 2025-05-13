import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Comparable key = "Section1";
        Paint paint = Color.RED;
        
        // Initialize a map to store section colors
        Map<Comparable, Paint> sectionColors = new HashMap<>();
        sectionColors.put("Section2", Color.BLUE);
        sectionColors.put("Section3", Color.GREEN);

        // Set colors for multiple sections
        for (Map.Entry<Comparable, Paint> entry : sectionColors.entrySet()) {
            plot.setSectionPaint(entry.getKey(), entry.getValue());
        }

        /* write */ plot.setSectionPaint(key, paint);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Retrieve and print section colors
        for (Comparable sectionKey : sectionColors.keySet()) {
            Paint sectionPaint = plot.getSectionPaint(sectionKey);
            System.out.println("Color of " + sectionKey + ": " + sectionPaint);
        }

        /* read */ Paint retrievedPaint = plot.getSectionPaint(key);
        System.out.println("Color of " + key + ": " + retrievedPaint);

        // Additional complex logic
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
        
        // Setting and retrieving another section paint
        plot.setSectionPaint("Section4", Color.YELLOW);
        Paint section4Paint = plot.getSectionPaint("Section4");
        System.out.println("Color of Section4: " + section4Paint);
    }
}