import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Set the fill paint using the write method
        /* write */ legendItem.setFillPaint(Color.RED);

        // Read the fill paint using the read method
        /* read */ Paint fillPaint = legendItem.getFillPaint();

        // Print the fill paint to verify
        System.out.println(fillPaint);
    }
}