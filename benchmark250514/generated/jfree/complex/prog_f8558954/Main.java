import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a BasicStroke object to set as the line stroke
        Stroke stroke = new BasicStroke(2.0f);

        /* write */ legendItem.setLineStroke(stroke);

        // Additional complexity: working with colors and another LegendItem
        Color color = new Color(255, 0, 0);
        LegendItem anotherLegendItem = new LegendItem("Another Legend");
        anotherLegendItem.setFillPaint(color);

        // Create a list to store legend items
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        legendItems.add(anotherLegendItem);

        // Iterate over the list and print details
        for (LegendItem item : legendItems) {
            System.out.println("Legend: " + item.getLabel());
            System.out.println("Color: " + item.getFillPaint());
        }

        // Perform some calculations and manipulations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        // Retrieve the stroke from the original LegendItem
        /* read */ Stroke readStroke = legendItem.getLineStroke();

        // Print the result to verify the stroke set and read are the same
        System.out.println(readStroke.equals(stroke));

        // Additional operations on stroke
        if (readStroke instanceof BasicStroke) {
            BasicStroke basicStroke = (BasicStroke) readStroke;
            System.out.println("Stroke width: " + basicStroke.getLineWidth());
        }
    }
}