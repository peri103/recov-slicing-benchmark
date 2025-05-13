import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a shape object to set
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        /* write */ legendItem.setShape(shape);

        // Additional code to make the program more complex
        ArrayList<LegendItem> legendList = new ArrayList<>();
        legendList.add(legendItem);
        legendList.add(new LegendItem("Another Legend", Color.BLUE));
        
        for (LegendItem item : legendList) {
            System.out.println("Legend: " + item.getLabel());
        }

        // Modify the color of the legend items
        for (LegendItem item : legendList) {
            item.setFillPaint(Color.RED);
        }

        // Create another shape and set it to another LegendItem
        Shape anotherShape = new Rectangle2D.Double(5, 5, 15, 15);
        legendList.get(1).setShape(anotherShape);

        // Retrieve and print the shape of the first LegendItem to verify
        /* read */ Shape readShape = legendItem.getShape();
        System.out.println("Read Shape: " + readShape);

        // Print the shapes of all legend items
        for (LegendItem item : legendList) {
            System.out.println("Shape: " + item.getShape());
        }
    }
}