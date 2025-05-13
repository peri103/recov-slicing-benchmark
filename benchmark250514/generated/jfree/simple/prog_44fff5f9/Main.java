import org.jfree.chart.LegendItem;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Label");

        // Define a font to be used
        Font font = new Font("Serif", Font.PLAIN, 12);

        // Set the label font using the write method
        /* write */ legendItem.setLabelFont(font);

        // Retrieve the label font using the read method
        /* read */ Font retrievedFont = legendItem.getLabelFont();

        // Print out the font to verify it has been correctly set and retrieved
        System.out.println("Font Name: " + retrievedFont.getFontName());
        System.out.println("Font Style: " + retrievedFont.getStyle());
        System.out.println("Font Size: " + retrievedFont.getSize());
    }
}