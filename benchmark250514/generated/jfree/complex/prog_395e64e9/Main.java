import org.jfree.chart.LegendItem;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Example");

        // Create a Font object to set as the label font
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Additional code: Create another LegendItem and set various properties
        LegendItem anotherLegendItem = new LegendItem("Another Example");
        anotherLegendItem.setLabelPaint(Color.BLUE);
        anotherLegendItem.setDescription("This is another legend item");
        
        // Additional code: Use an ArrayList to store LegendItem objects
        ArrayList<LegendItem> legendList = new ArrayList<>();
        legendList.add(legendItem);
        legendList.add(anotherLegendItem);

        // Iterate over the list and print descriptions
        for (LegendItem item : legendList) {
            System.out.println("Description: " + item.getDescription());
        }

        /* write */
        legendItem.setLabelFont(font);

        // Additional code: Modify the color of the first legend item
        legendList.get(0).setLabelPaint(Color.RED);

        // Additional code: Print out the color of the first legend item
        System.out.println("First Legend Item Color: " + legendList.get(0).getLabelPaint());

        /* read */
        Font retrievedFont = legendItem.getLabelFont();

        // Print out the font to verify it was correctly set and retrieved
        System.out.println("Font: " + retrievedFont.getFontName() + ", Style: " + retrievedFont.getStyle() + ", Size: " + retrievedFont.getSize());
    }
}