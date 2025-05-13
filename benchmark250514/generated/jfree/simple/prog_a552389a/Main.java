import org.jfree.chart.LegendItem;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Set the line paint color using the write method
        /* write */ legendItem.setLinePaint(Color.RED);

        // Read the line paint color using the read method
        /* read */ Color linePaint = (Color) legendItem.getLinePaint();

        // Print the read value to verify
        System.out.println("Line Paint Color: " + linePaint);
    }
}