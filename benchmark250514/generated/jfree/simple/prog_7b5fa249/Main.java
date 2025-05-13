import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        Stroke stroke = new BasicStroke(2.0f);
        LegendItem legendItem = new LegendItem("Sample");

        // Write operation: set the line stroke
        /* write */ legendItem.setLineStroke(stroke);

        // Read operation: get the line stroke
        /* read */ Stroke retrievedStroke = legendItem.getLineStroke();

        // Print the result to verify the read value
        System.out.println(retrievedStroke.equals(stroke));
    }
}