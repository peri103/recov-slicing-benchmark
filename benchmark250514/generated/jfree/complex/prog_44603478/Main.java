import org.jfree.chart.LegendItem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Comparable seriesKey = "Sample Key";

        ArrayList<String> legendDescriptions = new ArrayList<>();
        legendDescriptions.add("First Description");
        legendDescriptions.add("Second Description");
        legendDescriptions.add("Third Description");

        /* write */ legendItem.setSeriesKey(seriesKey);

        for (String description : legendDescriptions) {
            LegendItem tempLegendItem = new LegendItem(description);
            tempLegendItem.setSeriesKey(description);
            System.out.println("Temp Legend Item Key: " + tempLegendItem.getSeriesKey());
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* read */ Comparable retrievedKey = legendItem.getSeriesKey();
        System.out.println("Original Legend Item Key: " + retrievedKey);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        int total = 0;
        for (Integer num : numbers) {
            total += num;
        }
        System.out.println("Total of numbers array: " + total);
    }
}