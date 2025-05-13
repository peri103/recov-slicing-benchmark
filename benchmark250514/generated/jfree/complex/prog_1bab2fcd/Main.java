import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYPlot object
        XYPlot plot = new XYPlot();
        
        // Define the paint color
        Paint gridlinePaint = Color.BLUE;
        
        // Initialize a list to store paint objects
        List<Paint> paintList = new ArrayList<>();
        
        // Add some paint objects to the list
        paintList.add(Color.RED);
        paintList.add(Color.GREEN);
        paintList.add(Color.YELLOW);
        
        // Write operation for XYPlot
        /* write */ plot.setRangeGridlinePaint(gridlinePaint);
        
        // Perform operations on the list
        for (Paint paint : paintList) {
            System.out.println("Paint in list: " + paint);
        }
        
        // Add the gridline paint to the list
        paintList.add(gridlinePaint);
        
        // Perform more operations on the list
        for (int i = 0; i < paintList.size(); i++) {
            System.out.println("Paint at index " + i + ": " + paintList.get(i));
        }
        
        // Read operation for XYPlot
        /* read */ Paint retrievedPaint = plot.getRangeGridlinePaint();
        
        // Output the result
        System.out.println("Retrieved paint: " + retrievedPaint);
        
        // Perform additional operations
        XYPlot anotherPlot = new XYPlot();
        anotherPlot.setRangeGridlinePaint(Color.MAGENTA);
        Paint anotherRetrievedPaint = anotherPlot.getRangeGridlinePaint();
        System.out.println("Another retrieved paint: " + anotherRetrievedPaint);
    }
}