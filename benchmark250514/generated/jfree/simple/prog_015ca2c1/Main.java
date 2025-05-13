import org.jfree.chart.LegendItem;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Label");
        
        // Create a Font object
        Font font = new Font("Arial", Font.PLAIN, 12);
        
        // Use the setLabelFont method to set the font
        /* write */ legendItem.setLabelFont(font);
        
        // Retrieve the font using the getLabelFont method
        /* read */ Font retrievedFont = legendItem.getLabelFont();
        
        // Print out the font details to verify
        System.out.println("Font: " + retrievedFont.getFontName() + ", Size: " + retrievedFont.getSize());
    }
}