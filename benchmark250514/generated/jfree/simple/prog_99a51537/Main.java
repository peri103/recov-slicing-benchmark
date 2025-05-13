import java.awt.Font;
import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a Font object to be used
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Write operation: Set the label font of the LegendItem
        /* write */ legendItem.setLabelFont(font);

        // Read operation: Get the label font of the LegendItem
        /* read */ Font retrievedFont = legendItem.getLabelFont();

        // Print the retrieved font to verify the write and read operations
        System.out.println("Font: " + retrievedFont.getFontName() + ", Size: " + retrievedFont.getSize());
    }
}