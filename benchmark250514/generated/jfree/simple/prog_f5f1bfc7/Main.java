import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a Stroke object to be written
        Stroke stroke = new BasicStroke(2.0f);

        // Write operation: set the line stroke
        /* write */ legendItem.setLineStroke(stroke);

        // Read operation: get the line stroke
        /* read */ Stroke readStroke = legendItem.getLineStroke();

        // Print the result to verify the value
        System.out.println(readStroke);
    }
}