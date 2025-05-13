import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample");

        // Create a shape to set
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        // Create a list to store LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);

        // Set a color for the legend item
        Color color = new Color(255, 0, 0); // Red color
        legendItem.setFillPaint(color);

        /* write */ legendItem.setShape(shape);

        // Add more LegendItems to the list with different shapes
        LegendItem legendItem2 = new LegendItem("Sample 2");
        legendItem2.setFillPaint(new Color(0, 255, 0)); // Green color
        legendItem2.setShape(new Rectangle2D.Double(0, 0, 15, 15));
        legendItems.add(legendItem2);

        LegendItem legendItem3 = new LegendItem("Sample 3");
        legendItem3.setFillPaint(new Color(0, 0, 255)); // Blue color
        legendItem3.setShape(new Rectangle2D.Double(0, 0, 20, 20));
        legendItems.add(legendItem3);

        // Iterate over the legend items and print their colors
        for (LegendItem item : legendItems) {
            System.out.println("LegendItem: " + item.getLabel() + ", Color: " + item.getFillPaint());
        }

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* read */ Shape retrievedShape = legendItem.getShape();

        // Print the retrieved shape to verify
        System.out.println(retrievedShape);
    }
}