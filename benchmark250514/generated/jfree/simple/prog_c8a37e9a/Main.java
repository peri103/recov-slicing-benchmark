import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the LegendItem class
        LegendItem legendItem = new LegendItem("Sample");

        // Use the write method to set the line paint
        /* write */ legendItem.setLinePaint(Color.RED);

        // Use the read method to get the line paint
        /* read */ Paint linePaint = legendItem.getLinePaint();

        // Output the result to verify
        System.out.println(linePaint);
    }
}