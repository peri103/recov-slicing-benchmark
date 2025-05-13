import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        // Initialize LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a BasicStroke object to set as the line stroke
        Stroke stroke = new BasicStroke(2.0f);

        /* write */ legendItem.setLineStroke(stroke);

        /* read */ Stroke readStroke = legendItem.getLineStroke();

        // Print the result to verify the stroke set and read are the same
        System.out.println(readStroke.equals(stroke));
    }
}