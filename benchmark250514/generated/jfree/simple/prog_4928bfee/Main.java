import org.jfree.chart.LegendItem;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Set the fill paint using the write method
        /* write */ legendItem.setFillPaint(Color.RED);

        // Read the fill paint using the read method
        /* read */ Color fillPaint = (Color) legendItem.getFillPaint();

        // Print the color to ensure it was set and read correctly
        System.out.println(fillPaint);
    }
}