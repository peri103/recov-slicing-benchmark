import org.jfree.chart.LegendItem;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Item");

        // Create a Font object
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Use the write method to set the label font
        /* write */ legendItem.setLabelFont(font);

        // Use the read method to get the label font
        /* read */ Font retrievedFont = legendItem.getLabelFont();

        // Print the font to ensure it's the one we set
        System.out.println(retrievedFont);
    }
}