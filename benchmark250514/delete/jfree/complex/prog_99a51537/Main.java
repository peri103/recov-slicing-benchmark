import java.awt.Color;
import java.awt.Font;
import org.jfree.chart.LegendItem;
import org.jfree.chart.title.LegendTitle;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a Font object to be used
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Write operation: Set the label font of the LegendItem
        /* write */ legendItem.setLabelFont(font);

        // Add some complexity: Initialize a LegendTitle and set some properties
        LegendTitle legendTitle = new LegendTitle(null);
        legendTitle.setBackgroundPaint(Color.LIGHT_GRAY);
        legendTitle.setPosition(LegendTitle.BOTTOM);

        // Create a list of LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(new LegendItem("Item 1"));
        legendItems.add(new LegendItem("Item 2"));

        // Modify the font of each LegendItem in the list
        for (LegendItem item : legendItems) {
            item.setLabelFont(new Font("Serif", Font.BOLD, 10));
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Read operation: Get the label font of the original LegendItem
        /* read */ Font retrievedFont = legendItem.getLabelFont();

        // Print the retrieved font to verify the write and read operations
        System.out.println("Font: " + retrievedFont.getFontName() + ", Size: " + retrievedFont.getSize());

        // Print the font of all LegendItems in the list
        for (LegendItem item : legendItems) {
            System.out.println("LegendItem Font: " + item.getLabelFont().getFontName());
        }
    }
}