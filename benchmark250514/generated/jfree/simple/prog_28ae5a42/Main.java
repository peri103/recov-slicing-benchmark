import org.jfree.chart.LegendItem;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a Font object to be used
        Font font = new Font("Serif", Font.PLAIN, 12);

        // Use the write method to set the label font
        /* write */ legendItem.setLabelFont(font);

        // Use the read method to get the label font
        /* read */ Font retrievedFont = legendItem.getLabelFont();

        // Print the retrieved font to ensure it matches the one set
        System.out.println(retrievedFont);
    }
}