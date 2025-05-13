import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.XYPlot;
import java.awt.Font;
import java.awt.Color;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a PiePlot instance
        PiePlot piePlot = new PiePlot();
        
        // Create a Font instance
        Font font = new Font("Arial", Font.PLAIN, 12);
        
        // Use the write method to set the label font for PiePlot
        /* write */ piePlot.setLabelFont(font);
        
        // Additional operations on PiePlot
        piePlot.setBackgroundPaint(Color.LIGHT_GRAY);
        
        // Create a second plot of a different type
        XYPlot xyPlot = new XYPlot();
        xyPlot.setRangeGridlinePaint(Color.BLUE);
        
        // Use a HashMap to store and manipulate some data
        HashMap<String, Integer> dataMap = new HashMap<>();
        dataMap.put("A", 10);
        dataMap.put("B", 20);
        dataMap.put("C", 30);

        // Perform some calculations
        int sum = 0;
        for (Integer value : dataMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        // More operations on XYPlot
        xyPlot.setDomainGridlinePaint(Color.RED);
        
        // Retrieve the label font from PiePlot
        /* read */ Font readFont = piePlot.getLabelFont();
        
        // Print the font to verify it was set and read correctly
        System.out.println("Label Font: " + readFont);
        
        // Additional unrelated operations
        for (String key : dataMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + dataMap.get(key));
        }
        
        // Final operations on the plots
        piePlot.setOutlinePaint(Color.GREEN);
        xyPlot.setOutlinePaint(Color.BLACK);
    }
}