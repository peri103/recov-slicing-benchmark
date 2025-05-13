import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a Stroke object to be written
        Stroke stroke = new BasicStroke(2.0f);

        // Write operation: set the line stroke
        /* write */ legendItem.setLineStroke(stroke);

        // Initialize an ArrayList to store LegendItem objects
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);

        // Create a HashMap to map LegendItem names to their stroke widths
        HashMap<String, Float> strokeWidths = new HashMap<>();
        for (LegendItem item : legendItems) {
            Stroke itemStroke = item.getLineStroke();
            if (itemStroke instanceof BasicStroke) {
                strokeWidths.put(item.getLabel(), ((BasicStroke) itemStroke).getLineWidth());
            }
        }

        // Perform some operations on the HashMap
        float totalWidth = 0.0f;
        for (Float width : strokeWidths.values()) {
            totalWidth += width;
        }
        System.out.println("Total stroke width: " + totalWidth);

        // Read operation: get the line stroke
        /* read */ Stroke readStroke = legendItem.getLineStroke();

        // Print the result to verify the value
        System.out.println("Read stroke: " + readStroke);

        // Additional complexity: Modify the stroke and update the HashMap
        Stroke newStroke = new BasicStroke(3.0f);
        legendItem.setLineStroke(newStroke);
        strokeWidths.put(legendItem.getLabel(), ((BasicStroke) newStroke).getLineWidth());

        // Print updated stroke width
        System.out.println("Updated stroke width for '" + legendItem.getLabel() + "': " + strokeWidths.get(legendItem.getLabel()));
    }
}