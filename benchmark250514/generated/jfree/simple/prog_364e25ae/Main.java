import org.jfree.chart.LegendItem;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Use the setLinePaint method to set a color
        /* write */ legendItem.setLinePaint(Color.RED);

        // Retrieve the color using the getLinePaint method
        /* read */ Color linePaint = (Color) legendItem.getLinePaint();

        // Output the color to verify
        System.out.println(linePaint);
    }
}