import org.jfree.chart.LegendItem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Example");

        // Additional code: Create an ArrayList to store LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();

        // Add the LegendItem to the list
        legendItems.add(legendItem);

        // Set the series key using the write method
        /* write */ legendItem.setSeriesKey("SeriesKey");

        // Additional code: Create another LegendItem and add it to the list
        LegendItem anotherLegendItem = new LegendItem("Another Example");
        anotherLegendItem.setSeriesKey("AnotherSeriesKey");
        legendItems.add(anotherLegendItem);

        // Iterate over the list and print the series keys
        for (LegendItem item : legendItems) {
            // Read the series key using the read method
            /* read */ Object seriesKey = item.getSeriesKey();
            System.out.println(seriesKey);
        }

        // Additional code: Perform operations on the list
        for (int i = 0; i < legendItems.size(); i++) {
            LegendItem item = legendItems.get(i);
            System.out.println("Legend Item " + i + ": " + item.getLabel());
        }

        // Additional code: Modify the label of the first LegendItem
        legendItems.get(0).setLabel("Modified Example");
        System.out.println("Modified Label: " + legendItems.get(0).getLabel());
    }
}