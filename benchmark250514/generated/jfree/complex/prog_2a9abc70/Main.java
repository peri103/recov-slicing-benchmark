import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Item");
        
        // Create a Stroke object to set
        Stroke stroke = new BasicStroke(2.0f);
        
        // Create another LegendItem instance for additional complexity
        LegendItem anotherLegendItem = new LegendItem("Another Item", Color.BLUE);
        
        // Create a list to store LegendItems
        ArrayList<LegendItem> legendList = new ArrayList<>();
        
        // Add LegendItems to the list
        legendList.add(legendItem);
        legendList.add(anotherLegendItem);
        
        // Modify the color of the second LegendItem
        anotherLegendItem.setFillPaint(Color.RED);
        
        // Set the line stroke for the first LegendItem
        /* write */ legendItem.setLineStroke(stroke);
        
        // Iterate over the list and print the properties of each LegendItem
        for (LegendItem item : legendList) {
            System.out.println("Legend Item: " + item.getLabel());
            System.out.println("Fill Paint: " + item.getFillPaint());
        }
        
        // Read the line stroke from the first LegendItem
        /* read */ Stroke readStroke = legendItem.getLineStroke();
        
        // Print the result to verify
        System.out.println("Line Stroke: " + readStroke);
        
        // Additional complexity: calculate the sum of stroke widths
        float totalStrokeWidth = 0.0f;
        for (LegendItem item : legendList) {
            if (item.getLineStroke() instanceof BasicStroke) {
                totalStrokeWidth += ((BasicStroke) item.getLineStroke()).getLineWidth();
            }
        }
        
        // Print the total stroke width
        System.out.println("Total Stroke Width: " + totalStrokeWidth);
    }
}