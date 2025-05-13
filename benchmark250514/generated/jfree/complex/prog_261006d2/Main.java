import org.jfree.chart.LegendItem;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a Font object to write
        Font font = new Font("Serif", Font.PLAIN, 12);

        // Create another LegendItem object for additional operations
        LegendItem anotherLegendItem = new LegendItem("Another Legend");

        // Create a list to store LegendItem objects
        ArrayList<LegendItem> legendList = new ArrayList<>();
        legendList.add(legendItem);
        legendList.add(anotherLegendItem);

        // Randomly change the color of the legends
        Random random = new Random();
        for (LegendItem item : legendList) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            item.setFillPaint(randomColor);
        }

        /* write */ legendItem.setLabelFont(font);

        // Perform some unrelated mathematical operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Iterate over the list and print the color of each LegendItem
        for (LegendItem item : legendList) {
            System.out.println("Legend Color: " + item.getFillPaint());
        }

        /* read */ Font readFont = legendItem.getLabelFont();

        // Output the font details to verify the read value
        System.out.println("Font Name: " + readFont.getName());
        System.out.println("Font Style: " + readFont.getStyle());
        System.out.println("Font Size: " + readFont.getSize());

        // Additional operations with Font
        Font boldFont = new Font("Serif", Font.BOLD, 14);
        anotherLegendItem.setLabelFont(boldFont);
        System.out.println("Another Legend Font Size: " + anotherLegendItem.getLabelFont().getSize());
    }
}