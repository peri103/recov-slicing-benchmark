import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem instance
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a Stroke object to set
        Stroke stroke = new BasicStroke(2.0f);

        // Create another LegendItem for additional complexity
        LegendItem anotherLegendItem = new LegendItem("Another Sample Legend", Color.RED, Color.BLUE, Color.GREEN, new BasicStroke(1.0f), new BasicStroke(2.0f));

        // Create a list to store LegendItems
        ArrayList<LegendItem> legendItemList = new ArrayList<>();
        legendItemList.add(legendItem);
        legendItemList.add(anotherLegendItem);

        // Iterate over the list and perform operations
        for (LegendItem item : legendItemList) {
            System.out.println("Legend: " + item.getLabel());
            System.out.println("Outline Paint: " + item.getOutlinePaint());
            System.out.println("Line Stroke: " + item.getLineStroke());
        }

        /* write */ legendItem.setLineStroke(stroke);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Create a new Stroke and set it to anotherLegendItem
        Stroke newStroke = new BasicStroke(3.0f);
        anotherLegendItem.setLineStroke(newStroke);

        // Perform operations using anotherLegendItem
        System.out.println("Another Legend Line Stroke: " + anotherLegendItem.getLineStroke());

        // Continue with unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        /* read */ Stroke readStroke = legendItem.getLineStroke();

        // Output the result to verify
        System.out.println("Read Stroke: " + readStroke);
    }
}