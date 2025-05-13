import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        LegendItem anotherLegendItem = new LegendItem("Another Legend", Color.BLUE, Color.RED, Font.getFont("Arial"));
        
        // Configure properties of another legend item
        anotherLegendItem.setShapeVisible(false);
        anotherLegendItem.setLabelFont(new Font("Verdana", Font.BOLD, 12));
        
        // Perform operations with anotherLegendItem
        Color labelColor = anotherLegendItem.getLabelPaint();
        System.out.println("Another Legend Label Color: " + labelColor);
        
        // Perform unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Perform operations with legendItem
        /* write */ legendItem.setShapeVisible(true);
        
        // Further unrelated operations
        String message = "Complex operations completed!";
        System.out.println(message);
        
        // Read the configuration of legendItem
        /* read */ boolean isVisible = legendItem.isShapeVisible();
        System.out.println("Shape Visible: " + isVisible);
        
        // Additional operations
        legendItem.setLabelPaint(Color.GREEN);
        System.out.println("Legend Label Color: " + legendItem.getLabelPaint());
    }
}