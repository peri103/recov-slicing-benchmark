import org.jfree.chart.LegendItem;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Define a Font object
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Write the font to the LegendItem
        /* write */ legendItem.setLabelFont(font);

        // Create a new LegendItem with a different label
        LegendItem anotherLegendItem = new LegendItem("Another Sample");

        // Set a different font for the new LegendItem
        Font anotherFont = new Font("Verdana", Font.BOLD, 14);
        anotherLegendItem.setLabelFont(anotherFont);

        // Add color to the LegendItem
        Color color = new Color(255, 0, 0);
        legendItem.setFillPaint(color);

        // Create a list to store LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        legendItems.add(anotherLegendItem);

        // Iterate over the list and print details of each LegendItem
        for (LegendItem item : legendItems) {
            System.out.println("Label: " + item.getLabel());
            System.out.println("Font: " + item.getLabelFont());
            System.out.println("Color: " + item.getFillPaint());
        }

        // Manipulate the list
        legendItems.remove(anotherLegendItem);
        legendItems.add(new LegendItem("Third Sample"));

        // Read the font from the LegendItem
        /* read */ Font retrievedFont = legendItem.getLabelFont();

        // Print the font to verify it was set and read correctly
        System.out.println("Retrieved Font: " + retrievedFont);

        // Additional logic to demonstrate complexity
        for (int i = 0; i < legendItems.size(); i++) {
            LegendItem item = legendItems.get(i);
            if (item.getLabel().equals("Third Sample")) {
                item.setLabelFont(new Font("Courier", Font.ITALIC, 10));
            }
        }

        // Print the updated list
        for (LegendItem item : legendItems) {
            System.out.println("Updated Label: " + item.getLabel());
            System.out.println("Updated Font: " + item.getLabelFont());
        }
    }
}