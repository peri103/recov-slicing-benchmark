import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a Stroke object to set
        Stroke stroke = new BasicStroke(2.0f);

        /* write */ legendItem.setLineStroke(stroke);

        /* read */ Stroke readStroke = legendItem.getLineStroke();

        // Output the result to verify
        System.out.println(readStroke);
    }
}