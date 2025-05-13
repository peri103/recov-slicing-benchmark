import org.jfree.chart.LegendItem;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Use the write method
        /* write */ legendItem.setLabelPaint(Color.RED);

        // Use the read method
        /* read */ Color labelPaint = (Color) legendItem.getLabelPaint();

        // Print the result to verify
        System.out.println(labelPaint);
    }
}