import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem and a Shape
        LegendItem legendItem = new LegendItem("Sample Legend");
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        
        // Set the shape using the write method
        /* write */ legendItem.setShape(shape);

        // Create a list to store LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        
        // Add more LegendItems with different shapes and colors
        for (int i = 1; i < 5; i++) {
            LegendItem item = new LegendItem("Legend " + i);
            item.setShape(new Rectangle2D.Double(i, i, i * 10, i * 10));
            item.setFillPaint(new Color(i * 50, i * 50, i * 50));
            legendItems.add(item);
        }
        
        // Retrieve the shape using the read method
        /* read */ Shape readShape = legendItem.getShape();
        
        // Print the read shape
        System.out.println("Read Shape: " + readShape);

        // Print details of all LegendItems
        for (LegendItem item : legendItems) {
            System.out.println("Legend: " + item.getLabel() + ", Shape: " + item.getShape() + ", Color: " + item.getFillPaint());
        }
        
        // Perform some calculations with shapes
        double totalArea = 0;
        for (LegendItem item : legendItems) {
            Rectangle2D rect = (Rectangle2D) item.getShape();
            double area = rect.getWidth() * rect.getHeight();
            totalArea += area;
        }
        
        // Print the total area of all shapes
        System.out.println("Total Area of Shapes: " + totalArea);
    }
}