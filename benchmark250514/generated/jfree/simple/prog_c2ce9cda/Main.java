import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a Stroke object to set
        Stroke stroke = new BasicStroke(2.0f);

        // Write operation: set the line stroke
        /* write */ legendItem.setLineStroke(stroke);

        // Read operation: get the line stroke
        /* read */ Stroke retrievedStroke = legendItem.getLineStroke();

        // Print the result to verify
        System.out.println(retrievedStroke);
    }
}