import org.jfree.chart.LegendItem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        ArrayList<String> seriesKeys = new ArrayList<>();
        
        // Adding some series keys to the list
        seriesKeys.add("SeriesKey1");
        seriesKeys.add("SeriesKey2");
        seriesKeys.add("SeriesKey3");

        // Iterating over series keys and setting them to the LegendItem
        for (String key : seriesKeys) {
            legendItem.setSeriesKey(key);
        }

        // Performing some unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 5);
        }
        
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);

        // More unrelated operations
        ArrayList<String> labels = new ArrayList<>();
        labels.add("Label1");
        labels.add("Label2");
        labels.add("Label3");

        for (String label : labels) {
            System.out.println("Processing label: " + label);
        }

        // Retrieving the series key from LegendItem
        /* read */ Object seriesKey = legendItem.getSeriesKey();
        System.out.println("Final Series Key: " + seriesKey);
    }
}