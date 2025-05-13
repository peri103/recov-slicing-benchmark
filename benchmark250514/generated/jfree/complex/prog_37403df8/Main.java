import org.jfree.chart.LegendItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Comparable seriesKey = "SeriesKey1";
        
        /* write */ legendItem.setSeriesKey(seriesKey);

        // Additional complex logic
        Map<String, List<String>> dataMap = new HashMap<>();
        List<String> dataList = new ArrayList<>();
        dataList.add("Data1");
        dataList.add("Data2");
        dataMap.put("Key1", dataList);

        for (Map.Entry<String, List<String>> entry : dataMap.entrySet()) {
            System.out.println("Processing: " + entry.getKey());
            for (String data : entry.getValue()) {
                System.out.println("Data: " + data);
            }
        }

        // More unrelated logic
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Continue with the original logic
        /* read */ Comparable retrievedKey = legendItem.getSeriesKey();

        System.out.println("Retrieved Series Key: " + retrievedKey);
    }
}