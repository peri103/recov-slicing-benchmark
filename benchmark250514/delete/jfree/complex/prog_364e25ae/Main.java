import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Use the setLinePaint method to set a color
        /* write */ legendItem.setLinePaint(Color.RED);

        // Additional code to make the program more complex
        // Initialize another LegendItem
        LegendItem anotherLegendItem = new LegendItem("Another Legend");

        // Set line paint for another legend item
        anotherLegendItem.setLinePaint(Color.BLUE);

        // Set font for both legend items
        Font customFont = new Font("Serif", Font.BOLD, 12);
        legendItem.setLabelFont(customFont);
        anotherLegendItem.setLabelFont(customFont);

        // Create a list to hold LegendItems
        ArrayList<LegendItem> legendList = new ArrayList<>();
        legendList.add(legendItem);
        legendList.add(anotherLegendItem);

        // Iterate over the list and print details
        for (LegendItem item : legendList) {
            System.out.println("Legend: " + item.getLabel());
            System.out.println("Font: " + item.getLabelFont());
        }

        // Retrieve the color using the getLinePaint method
        /* read */ Color linePaint = (Color) legendItem.getLinePaint();

        // Output the color to verify
        System.out.println("Line Paint Color: " + linePaint);

        // Set additional attributes for complexity
        legendItem.setLabel("Updated Legend");
        anotherLegendItem.setLabel("Another Updated Legend");

        // Print updated labels
        for (LegendItem item : legendList) {
            System.out.println("Updated Legend: " + item.getLabel());
        }
    }
}