import org.jfree.chart.LegendItem;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem and set its label font
        LegendItem legendItem = new LegendItem("Sample Legend");
        
        // Create a Font object to set as the label font
        Font font = new Font("Arial", Font.PLAIN, 12);
        
        /* write */ legendItem.setLabelFont(font);

        // Create a list of LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);

        // Add more LegendItems with different properties
        legendItems.add(new LegendItem("Legend 2", Color.RED));
        legendItems.add(new LegendItem("Legend 3", Color.BLUE));

        // Manipulate list of LegendItems
        for (LegendItem item : legendItems) {
            System.out.println("Legend: " + item.getLabel());
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* read */ Font retrievedFont = legendItem.getLabelFont();
        
        System.out.println("Font Name: " + retrievedFont.getFontName());
        System.out.println("Font Style: " + retrievedFont.getStyle());
        System.out.println("Font Size: " + retrievedFont.getSize());

        // Further manipulation of LegendItems
        for (LegendItem item : legendItems) {
            item.setLabelFont(new Font("Times New Roman", Font.BOLD, 14));
            System.out.println("Updated Legend: " + item.getLabel());
        }
    }
}