import org.jfree.chart.LegendItem;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem with a label
        LegendItem legendItem = new LegendItem("Sample Legend");
        Font font = new Font("Arial", Font.PLAIN, 12);
        
        // Create a list to store LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        
        // Add the LegendItem to the list
        legendItems.add(legendItem);

        // Set the font for the LegendItem
        /* write */ legendItem.setLabelFont(font);
        
        // Add more LegendItems to the list with different properties
        LegendItem legendItem2 = new LegendItem("Another Legend", Color.RED);
        legendItem2.setLabelFont(new Font("Verdana", Font.BOLD, 14));
        legendItems.add(legendItem2);
        
        LegendItem legendItem3 = new LegendItem("Third Legend", Color.BLUE);
        legendItem3.setLabelFont(new Font("Tahoma", Font.ITALIC, 16));
        legendItems.add(legendItem3);

        // Iterate over the list and print details of each LegendItem
        for (LegendItem item : legendItems) {
            System.out.println("Legend Label: " + item.getLabel());
            System.out.println("Legend Color: " + item.getFillPaint());
        }

        // Read the font of the first LegendItem
        /* read */ Font readFont = legendItems.get(0).getLabelFont();
        
        System.out.println("Font Name: " + readFont.getName());
        System.out.println("Font Style: " + readFont.getStyle());
        System.out.println("Font Size: " + readFont.getSize());
        
        // Perform some unrelated calculations to add complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);
    }
}