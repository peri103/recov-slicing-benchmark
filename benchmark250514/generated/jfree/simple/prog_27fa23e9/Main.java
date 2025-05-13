import org.jfree.chart.LegendItem;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Define a Font object
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Write the font to the LegendItem
        /* write */ legendItem.setLabelFont(font);

        // Read the font from the LegendItem
        /* read */ Font retrievedFont = legendItem.getLabelFont();

        // Print the font to verify it was set and read correctly
        System.out.println(retrievedFont);
    }
}