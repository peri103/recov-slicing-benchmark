import org.jfree.chart.LegendItem;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Label");
        
        // Create a Font object
        Font font = new Font("Arial", Font.PLAIN, 12);
        
        // Use the setLabelFont method to set the font
        /* write */ legendItem.setLabelFont(font);
        
        // Initialize an ArrayList to hold LegendItem objects
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        
        // Add the legendItem to the list
        legendItems.add(legendItem);
        
        // Create additional LegendItem objects with different properties
        LegendItem legendItem2 = new LegendItem("Another Label", Color.RED);
        Font font2 = new Font("Times New Roman", Font.BOLD, 14);
        legendItem2.setLabelFont(font2);
        legendItems.add(legendItem2);
        
        // Iterate over the list and print each item's label and font
        for (LegendItem item : legendItems) {
            System.out.println("Label: " + item.getLabel());
            System.out.println("Font: " + item.getLabelFont().getFontName() + ", Size: " + item.getLabelFont().getSize());
        }
        
        // Perform some calculations with font sizes
        int totalFontSize = 0;
        for (LegendItem item : legendItems) {
            totalFontSize += item.getLabelFont().getSize();
        }
        
        // Print the total font size
        System.out.println("Total Font Size: " + totalFontSize);
        
        // Retrieve the font using the getLabelFont method
        /* read */ Font retrievedFont = legendItem.getLabelFont();
        
        // Print out the font details to verify
        System.out.println("Retrieved Font: " + retrievedFont.getFontName() + ", Size: " + retrievedFont.getSize());
        
        // Create a new LegendItem with a different label and font
        LegendItem legendItem3 = new LegendItem("Third Label", Color.BLUE);
        Font font3 = new Font("Courier New", Font.ITALIC, 10);
        legendItem3.setLabelFont(font3);
        legendItems.add(legendItem3);
        
        // Print details of all legend items again
        for (LegendItem item : legendItems) {
            System.out.println("Label: " + item.getLabel());
            System.out.println("Font: " + item.getLabelFont().getFontName() + ", Size: " + item.getLabelFont().getSize());
        }
    }
}