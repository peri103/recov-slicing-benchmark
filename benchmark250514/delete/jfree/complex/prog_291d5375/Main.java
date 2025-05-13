import org.jfree.chart.LegendItem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example");
        
        // Additional code using ArrayList
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");
        
        // Perform some operations on the list
        for (String str : stringList) {
            System.out.println("String in list: " + str);
        }
        
        // Modify the legend item
        legendItem.setLabel("New Label");
        
        // More operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Write to the LegendItem
        /* write */ legendItem.setSeriesKey("SeriesKeyExample");
        
        // Further unrelated operations
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integerList.add(i * 10);
        }
        
        for (int value : integerList) {
            System.out.println("Integer in list: " + value);
        }
        
        // Read from the LegendItem
        /* read */ Object seriesKey = legendItem.getSeriesKey();
        System.out.println("Series Key: " + seriesKey);
    }
}