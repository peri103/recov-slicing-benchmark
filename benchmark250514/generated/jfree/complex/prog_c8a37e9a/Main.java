import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the LegendItem class
        LegendItem legendItem = new LegendItem("Sample");

        // Use the write method to set the line paint
        /* write */ legendItem.setLinePaint(Color.RED);

        // Additional code to make the program more complex
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        
        LegendItem anotherLegendItem = new LegendItem("Another Sample");
        anotherLegendItem.setLinePaint(Color.BLUE);
        legendItems.add(anotherLegendItem);

        // Perform some operations on the list of LegendItems
        for (LegendItem item : legendItems) {
            System.out.println("Legend Item: " + item.getLabel());
        }

        // Use the read method to get the line paint
        /* read */ Paint linePaint = legendItem.getLinePaint();

        // Output the result to verify
        System.out.println("Line Paint of 'Sample': " + linePaint);

        // Further operations
        Paint anotherLinePaint = anotherLegendItem.getLinePaint();
        System.out.println("Line Paint of 'Another Sample': " + anotherLinePaint);

        // Modify the legend items and verify changes
        legendItem.setLinePaint(Color.GREEN);
        anotherLegendItem.setLinePaint(Color.YELLOW);

        for (LegendItem item : legendItems) {
            System.out.println("Updated Line Paint of '" + item.getLabel() + "': " + item.getLinePaint());
        }
    }
}