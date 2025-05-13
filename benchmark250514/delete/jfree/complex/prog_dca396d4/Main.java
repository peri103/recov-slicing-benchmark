import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Initialize another LegendItem object for additional complexity
        LegendItem anotherLegendItem = new LegendItem("Another Legend");

        // Initialize an ArrayList to store LegendItems
        ArrayList<LegendItem> legendList = new ArrayList<>();
        legendList.add(legendItem);
        legendList.add(anotherLegendItem);

        // Use the write method on the first LegendItem
        /* write */ legendItem.setLabelPaint(Color.RED);

        // Set label paint for the second LegendItem
        anotherLegendItem.setLabelPaint(Color.BLUE);

        // Set font for the LegendItems
        Font font = new Font("Arial", Font.BOLD, 12);
        legendItem.setLabelFont(font);
        anotherLegendItem.setLabelFont(font);

        // Iterate through the list and print properties of each LegendItem
        for (LegendItem item : legendList) {
            System.out.println("Legend: " + item.getLabel());
            System.out.println("Font: " + item.getLabelFont());
            System.out.println("Paint: " + item.getLabelPaint());
        }

        // Use the read method on the first LegendItem
        /* read */ Color labelPaint = (Color) legendItem.getLabelPaint();

        // Print the result to verify
        System.out.println("Read Label Paint: " + labelPaint);

        // Perform additional operations to increase complexity
        if (labelPaint.equals(Color.RED)) {
            System.out.println("The label paint is correctly set to RED.");
        } else {
            System.out.println("The label paint is not RED.");
        }

        // Modify the label of the LegendItems
        legendItem.setLabel("Updated Sample Legend");
        anotherLegendItem.setLabel("Updated Another Legend");

        // Print updated labels
        System.out.println("Updated Legend 1: " + legendItem.getLabel());
        System.out.println("Updated Legend 2: " + anotherLegendItem.getLabel());
    }
}