import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend", "Sample Description", "Sample ToolTip", "Sample URL", new Rectangle2D.Double(0, 0, 10, 10), null);
        Shape newShape = new Rectangle2D.Double(0, 0, 20, 20);
        
        // Additional code to make the program more complex
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            LegendItem item = new LegendItem("Legend " + i, "Description " + i, "ToolTip " + i, "URL " + i, new Rectangle2D.Double(0, 0, i * 10, i * 10), Color.getHSBColor(i * 0.1f, 0.9f, 0.9f));
            legendItems.add(item);
        }
        
        for (LegendItem item : legendItems) {
            System.out.println(item.getLabel());
        }
        
        /* write */ legendItem.setShape(newShape);
        
        // More operations on the legendItems list
        for (LegendItem item : legendItems) {
            Shape shape = item.getShape();
            System.out.println("Shape: " + shape.getBounds2D());
        }
        
        /* read */ Shape shape = legendItem.getShape();
        System.out.println("Updated shape: " + shape.getBounds2D());
        
        // Additional operations to further increase complexity
        for (LegendItem item : legendItems) {
            item.setShape(new Rectangle2D.Double(0, 0, 15, 15));
        }
        
        for (LegendItem item : legendItems) {
            System.out.println("Modified Shape: " + item.getShape().getBounds2D());
        }
    }
}