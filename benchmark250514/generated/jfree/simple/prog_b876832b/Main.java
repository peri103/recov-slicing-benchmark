import org.jfree.chart.LegendItem;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a Font object to set
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Write operation: set the label font
        /* write */ legendItem.setLabelFont(font);

        // Read operation: get the label font
        /* read */ Font retrievedFont = legendItem.getLabelFont();

        // Print the font to verify
        System.out.println("Font: " + retrievedFont.getFontName() + ", Size: " + retrievedFont.getSize());
    }
}