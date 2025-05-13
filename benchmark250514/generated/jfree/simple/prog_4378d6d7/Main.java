import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem
        LegendItem legendItem = new LegendItem("Sample Item");

        // Use the write method to set the fill paint
        /* write */ legendItem.setFillPaint(Color.RED);

        // Use the read method to get the fill paint
        /* read */ Paint fillPaint = legendItem.getFillPaint();

        // Print the fill paint to verify the operation
        System.out.println(fillPaint);
    }
}