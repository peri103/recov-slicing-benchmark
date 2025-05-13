import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample");
        LegendItem anotherLegendItem = new LegendItem("Another Sample");
        
        List<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        legendItems.add(anotherLegendItem);

        /* write */ legendItem.setLinePaint(Color.RED);
        anotherLegendItem.setLinePaint(Color.BLUE);

        // Perform some operations on the list of legend items
        for (LegendItem item : legendItems) {
            System.out.println("Legend Item: " + item.getLabel());
        }

        // Modify another legend item
        anotherLegendItem.setLinePaint(Color.GREEN);
        
        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Retrieve the paint of the first legend item
        /* read */ Paint paint = legendItem.getLinePaint();
        System.out.println("Line Paint of first Legend Item: " + paint);

        // Additional unrelated operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}