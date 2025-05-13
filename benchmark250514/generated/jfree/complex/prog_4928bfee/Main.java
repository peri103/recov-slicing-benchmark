import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Set the fill paint using the write method
        /* write */ legendItem.setFillPaint(Color.RED);

        // Create a list of LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        legendItems.add(new LegendItem("Another Legend", Color.BLUE));

        // Set the outline stroke for each legend item
        for (LegendItem item : legendItems) {
            item.setOutlineStroke(new BasicStroke(2.0f));
        }

        // Perform some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Read the fill paint using the read method
        /* read */ Color fillPaint = (Color) legendItem.getFillPaint();

        // Print the color to ensure it was set and read correctly
        System.out.println("Fill Paint of Sample Legend: " + fillPaint);

        // Print details of all legend items
        for (LegendItem item : legendItems) {
            Stroke outlineStroke = item.getOutlineStroke();
            System.out.println("Legend: " + item.getLabel() + ", Outline Stroke: " + outlineStroke);
        }
    }
}