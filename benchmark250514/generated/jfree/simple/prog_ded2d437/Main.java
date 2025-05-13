import org.jfree.chart.LegendItem;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        
        // Create a Color object to use with setLinePaint
        Color linePaintColor = Color.RED;
        
        /* write */ legendItem.setLinePaint(linePaintColor);
        
        /* read */ Color readColor = (Color) legendItem.getLinePaint();
        
        // Print the read color to verify it's the same as the written color
        System.out.println("Line Paint Color: " + readColor.toString());
    }
}