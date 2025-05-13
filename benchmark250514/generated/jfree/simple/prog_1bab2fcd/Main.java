import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYPlot object
        XYPlot plot = new XYPlot();
        
        // Define the paint color
        Paint gridlinePaint = Color.BLUE;
        
        // Write operation
        /* write */ plot.setRangeGridlinePaint(gridlinePaint);
        
        // Read operation
        /* read */ Paint retrievedPaint = plot.getRangeGridlinePaint();
        
        // Output the result
        System.out.println(retrievedPaint);
    }
}