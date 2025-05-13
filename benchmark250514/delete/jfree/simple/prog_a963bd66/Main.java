import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create a new LegendItem with default values
        LegendItem legendItem = new LegendItem("Sample Label", "Description", "Tool Tip", "URL", true, null, true, null, true, null, true, null);

        // Set a label paint using the write method
        /* write */ legendItem.setLabelPaint(Color.RED);

        // Retrieve the label paint using the read method
        /* read */ Paint labelPaint = legendItem.getLabelPaint();

        // Print the paint to verify the write and read operation
        System.out.println(labelPaint);
    }
}