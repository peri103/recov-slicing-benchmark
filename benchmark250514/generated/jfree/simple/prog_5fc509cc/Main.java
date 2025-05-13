import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample");

        // Create a Stroke instance to be used for writing
        Stroke stroke = new BasicStroke(2.0f);

        // Write operation: set the line stroke
        /* write */ legendItem.setLineStroke(stroke);

        // Read operation: get the line stroke
        /* read */ Stroke readStroke = legendItem.getLineStroke();

        // Output the result to verify the correct stroke is read
        System.out.println(readStroke);
    }
}