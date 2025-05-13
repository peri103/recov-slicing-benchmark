import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot
        PiePlot piePlot = new PiePlot();
        Comparable key = "Section1";
        Stroke stroke = new BasicStroke(2.0f);
        
        // Initialize CategoryPlot for additional complexity
        CategoryPlot categoryPlot = new CategoryPlot();
        NumberAxis rangeAxis = new NumberAxis("Value");
        categoryPlot.setRangeAxis(rangeAxis);
        categoryPlot.setOutlinePaint(Color.BLUE);
        
        // HashMap to store strokes for different sections
        HashMap<String, Stroke> strokeMap = new HashMap<>();
        strokeMap.put("Section1", new BasicStroke(2.0f));
        strokeMap.put("Section2", new BasicStroke(3.0f));
        
        // Write operation on PiePlot
        /* write */ piePlot.setSectionOutlineStroke(key, stroke);
        
        // Additional operations on CategoryPlot
        categoryPlot.setOutlineStroke(strokeMap.get("Section2"));
        Stroke categoryStroke = categoryPlot.getOutlineStroke();
        System.out.println("CategoryPlot Outline Stroke: " + categoryStroke);
        
        // More complex operations
        for (String section : strokeMap.keySet()) {
            Stroke s = strokeMap.get(section);
            piePlot.setSectionOutlineStroke(section, s);
        }
        
        // Unrelated mathematical operations
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of first 100 numbers: " + sum);
        
        // Read operation on PiePlot
        /* read */ Stroke retrievedStroke = piePlot.getSectionOutlineStroke(key);
        
        // Output the result of the read operation
        System.out.println("PiePlot Section1 Outline Stroke: " + retrievedStroke);
        
        // Additional unrelated code for complexity
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}