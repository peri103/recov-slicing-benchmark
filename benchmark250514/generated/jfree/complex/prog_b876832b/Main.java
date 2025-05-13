import org.jfree.chart.LegendItem;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a Font object to set
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Write operation: set the label font
        /* write */ legendItem.setLabelFont(font);

        // Create a list of LegendItems
        ArrayList<LegendItem> legendItemList = new ArrayList<>();

        // Add multiple LegendItems to the list
        for (int i = 0; i < 5; i++) {
            LegendItem item = new LegendItem("Item " + i);
            item.setLabelPaint(new Color(i * 50, i * 50, i * 50)); // Set different colors
            legendItemList.add(item);
        }

        // Perform operations on the list
        for (LegendItem item : legendItemList) {
            System.out.println("Legend Item: " + item.getLabel() + ", Color: " + item.getLabelPaint());
        }

        // Additional complex operations
        LegendItem specialItem = new LegendItem("Special");
        specialItem.setLabelPaint(Color.RED);
        legendItemList.add(specialItem);

        for (LegendItem item : legendItemList) {
            if (item.getLabel().equals("Special")) {
                System.out.println("Found special item with color: " + item.getLabelPaint());
            }
        }

        // Read operation: get the label font
        /* read */ Font retrievedFont = legendItem.getLabelFont();

        // Print the font to verify
        System.out.println("Font: " + retrievedFont.getFontName() + ", Size: " + retrievedFont.getSize());
    }
}