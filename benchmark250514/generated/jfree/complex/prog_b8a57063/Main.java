import org.jfree.chart.LegendItem;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample");
        Font font = new Font("Serif", Font.PLAIN, 12);
        Color color = Color.RED;

        /* write */ legendItem.setLabelFont(font);

        // Additional code to make the program more complex
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        LegendItem anotherLegendItem = new LegendItem("Another Sample");
        anotherLegendItem.setLabelPaint(color);
        legendItems.add(anotherLegendItem);

        // Manipulate the list of LegendItems
        for (LegendItem item : legendItems) {
            System.out.println("Legend Item: " + item.getLabel());
        }

        // Perform some operations on the legend items
        for (LegendItem item : legendItems) {
            if (item.getLabel().equals("Sample")) {
                item.setLabelPaint(Color.BLUE);
            }
        }

        // Retrieve and print the label font of the original legend item
        /* read */ Font readFont = legendItem.getLabelFont();
        System.out.println("Font: " + readFont.getFontName() + ", Size: " + readFont.getSize());

        // Print the paint color of each legend item
        for (LegendItem item : legendItems) {
            System.out.println("Paint Color: " + item.getLabelPaint());
        }
    }
}