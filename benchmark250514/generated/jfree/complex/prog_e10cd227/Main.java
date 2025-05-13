import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem with a label and color
        LegendItem legendItem = new LegendItem("Example Legend", Color.BLUE);
        
        // Create a shape to be used in the LegendItem
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        // Initialize another LegendItem for demonstration
        LegendItem anotherLegendItem = new LegendItem("Another Legend", Color.RED);
        Shape anotherShape = new Rectangle2D.Double(0, 0, 5, 5);
        anotherLegendItem.setShape(anotherShape);

        // Create a list to store LegendItems
        ArrayList<LegendItem> legendList = new ArrayList<>();
        legendList.add(legendItem);
        legendList.add(anotherLegendItem);

        // Perform some operations on the list
        for (LegendItem item : legendList) {
            System.out.println("Legend: " + item.getLabel() + ", Color: " + item.getFillPaint());
        }

        // Set the shape in the original legendItem
        /* write */ legendItem.setShape(shape);

        // Perform more operations
        for (LegendItem item : legendList) {
            if (item.getLabel().equals("Example Legend")) {
                item.setFillPaint(Color.GREEN);
            }
        }

        // Retrieve the shape from the legendItem
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Print the retrieved shape
        System.out.println("Retrieved Shape: " + retrievedShape);

        // Further manipulation of the list
        for (LegendItem item : legendList) {
            System.out.println("Updated Legend: " + item.getLabel() + ", Color: " + item.getFillPaint());
        }
    }
}