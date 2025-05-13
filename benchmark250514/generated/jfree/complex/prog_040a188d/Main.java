import org.jfree.chart.LegendItem;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Creating a LegendItem and setting a series index
        LegendItem legendItem = new LegendItem("Sample Legend", "Description", "ToolTip", "URL", null, null);
        /* write */ legendItem.setSeriesIndex(5);

        // Creating additional data structures for complexity
        ArrayList<String> legends = new ArrayList<>();
        HashMap<String, Integer> legendMap = new HashMap<>();

        // Adding some legends to the list and map
        for (int i = 0; i < 5; i++) {
            String legendName = "Legend " + i;
            legends.add(legendName);
            legendMap.put(legendName, i);
        }

        // Manipulating the list and map
        for (String legend : legends) {
            int index = legendMap.get(legend);
            System.out.println("Legend: " + legend + ", Index: " + index);
        }

        // Performing some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers is: " + sum);

        // Retrieving the series index from the LegendItem
        /* read */ int seriesIndex = legendItem.getSeriesIndex();
        System.out.println("Series Index from LegendItem: " + seriesIndex);

        // More operations on legends
        for (int i = 0; i < legends.size(); i++) {
            String legend = legends.get(i);
            System.out.println("Processing: " + legend);
        }

        // Final operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers is: " + product);
    }
}