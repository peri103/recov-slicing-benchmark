import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Use the write method to set the fill paint
        /* write */ legendItem.setFillPaint(Color.RED);

        // Use the read method to get the fill paint
        /* read */ Paint fillPaint = legendItem.getFillPaint();

        // Print the fill paint to verify
        System.out.println(fillPaint);
    }
}