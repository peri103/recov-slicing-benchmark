import org.jfree.chart.LegendItem;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize LegendItem with necessary parameters
        LegendItem legendItem = new LegendItem("Sample Legend", Color.BLACK);

        // Write operation: set the line paint to a specific color
        /* write */ legendItem.setLinePaint(Color.RED);

        // Read operation: retrieve the line paint color
        /* read */ Color linePaint = legendItem.getLinePaint();

        // Output the result
        System.out.println(linePaint);
    }
}