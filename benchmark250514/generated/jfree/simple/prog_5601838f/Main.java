import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Use the write method to set the label paint
        /* write */ legendItem.setLabelPaint(Color.RED);

        // Use the read method to get the label paint
        /* read */ Paint labelPaint = legendItem.getLabelPaint();

        // Output the result to verify the read value is the same as the written value
        System.out.println(labelPaint);
    }
}