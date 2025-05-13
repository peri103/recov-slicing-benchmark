import org.jfree.chart.LegendItem;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Item");

        // Create a Font object
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Use the write method to set the label font
        /* write */ legendItem.setLabelFont(font);

        // Create another LegendItem with different properties
        LegendItem legendItem2 = new LegendItem("Another Item", Color.BLUE);
        legendItem2.setLabelFont(new Font("Courier", Font.BOLD, 14));

        // Create a list to store legend items
        ArrayList<LegendItem> legendItemList = new ArrayList<>();
        legendItemList.add(legendItem);
        legendItemList.add(legendItem2);

        // Iterate over the list and print the items' properties
        for (LegendItem item : legendItemList) {
            System.out.println("Item Label: " + item.getLabel());
            System.out.println("Item Font: " + item.getLabelFont());
        }

        // Perform some unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Use the read method to get the label font
        /* read */ Font retrievedFont = legendItem.getLabelFont();

        // Print the font to ensure it's the one we set
        System.out.println("Retrieved Font: " + retrievedFont);
    }
}