import org.jfree.chart.LegendItem;
import org.jfree.chart.title.LegendTitle;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem and set its series index
        LegendItem legendItem = new LegendItem("Example");
        /* write */ legendItem.setSeriesIndex(5);

        // Create a LegendTitle and add some LegendItems
        LegendTitle legendTitle = new LegendTitle(null);
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            LegendItem item = new LegendItem("Item " + i);
            item.setSeriesIndex(i);
            legendItems.add(item);
            legendTitle.addLegendItem(item);
        }

        // Perform some operations on the LegendItems
        for (LegendItem item : legendItems) {
            if (item.getSeriesIndex() % 2 == 0) {
                System.out.println("Even Series Index: " + item.getSeriesIndex());
            } else {
                System.out.println("Odd Series Index: " + item.getSeriesIndex());
            }
        }

        // Read the series index of the original LegendItem
        /* read */ int seriesIndex = legendItem.getSeriesIndex();
        System.out.println("Original LegendItem Series Index: " + seriesIndex);

        // Additional unrelated operations
        int sum = 0;
        for (int i = 0; i < legendItems.size(); i++) {
            sum += legendItems.get(i).getSeriesIndex();
        }
        System.out.println("Sum of Series Indices: " + sum);

        // Update a LegendItem and print details
        LegendItem firstItem = legendItems.get(0);
        firstItem.setSeriesIndex(10);
        System.out.println("Updated First Item Series Index: " + firstItem.getSeriesIndex());
    }
}