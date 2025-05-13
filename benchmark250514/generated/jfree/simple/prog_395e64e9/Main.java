import org.jfree.chart.LegendItem;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Example");

        // Create a Font object to set as the label font
        Font font = new Font("Arial", Font.PLAIN, 12);

        /* write */
        legendItem.setLabelFont(font);

        /* read */
        Font retrievedFont = legendItem.getLabelFont();

        // Print out the font to verify it was correctly set and retrieved
        System.out.println("Font: " + retrievedFont.getFontName() + ", Style: " + retrievedFont.getStyle() + ", Size: " + retrievedFont.getSize());
    }
}