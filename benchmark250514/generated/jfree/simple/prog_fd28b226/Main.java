import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Set the label paint using the write method
        /* write */ legendItem.setLabelPaint(Color.RED);

        // Retrieve the label paint using the read method
        /* read */ Paint labelPaint = legendItem.getLabelPaint();

        // Print the label paint to verify the value
        System.out.println(labelPaint.toString());
    }
}