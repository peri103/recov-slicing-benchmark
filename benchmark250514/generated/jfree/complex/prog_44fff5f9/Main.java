import org.jfree.chart.LegendItem;
import java.awt.Font;
import java.awt.Color;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Label");

        // Define a font to be used
        Font font = new Font("Serif", Font.PLAIN, 12);

        // Set the label font using the write method
        /* write */ legendItem.setLabelFont(font);

        // Create a HashMap to store LegendItems with their labels
        HashMap<String, LegendItem> legendMap = new HashMap<>();
        legendMap.put("Sample Label", legendItem);

        // Create another LegendItem with a different font and color
        LegendItem anotherLegendItem = new LegendItem("Another Label");
        Font anotherFont = new Font("SansSerif", Font.BOLD, 14);
        anotherLegendItem.setLabelFont(anotherFont);
        anotherLegendItem.setLabelPaint(Color.RED);
        legendMap.put("Another Label", anotherLegendItem);

        // Simulate some complex operations
        ArrayList<Font> fontList = new ArrayList<>();
        for (LegendItem item : legendMap.values()) {
            fontList.add(item.getLabelFont());
        }

        // Retrieve the label font using the read method
        /* read */ Font retrievedFont = legendItem.getLabelFont();

        // Print out the font to verify it has been correctly set and retrieved
        System.out.println("Font Name: " + retrievedFont.getFontName());
        System.out.println("Font Style: " + retrievedFont.getStyle());
        System.out.println("Font Size: " + retrievedFont.getSize());

        // More complex operations: iterate over fontList and print details
        for (Font f : fontList) {
            System.out.println("Font from List - Name: " + f.getFontName() + ", Style: " + f.getStyle() + ", Size: " + f.getSize());
        }
    }
}