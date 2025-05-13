import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a shape to set
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        /* write */ legendItem.setShape(shape);

        // Additional code to make the program more complex
        // Create a list to hold LegendItem objects
        ArrayList<LegendItem> legendList = new ArrayList<>();

        // Add the legendItem to the list
        legendList.add(legendItem);

        // Create a new LegendItem and set its properties
        LegendItem anotherLegendItem = new LegendItem("Another Legend");
        anotherLegendItem.setLabelPaint(Color.RED);
        anotherLegendItem.setDescription("This is another legend item.");
        anotherLegendItem.setShape(new Rectangle2D.Double(5, 5, 15, 15));

        // Add the new LegendItem to the list
        legendList.add(anotherLegendItem);

        // Iterate through the list and print each LegendItem's description
        for (LegendItem item : legendList) {
            System.out.println(item.getDescription());
        }

        // Perform some operations unrelated to LegendItem
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Retrieve the shape from the legendItem
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Print the retrieved shape to verify
        System.out.println(retrievedShape);
    }
}