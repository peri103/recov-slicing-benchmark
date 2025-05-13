import org.jfree.chart.LegendItem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem
        LegendItem legendItem = new LegendItem("Example Legend");

        // Initialize another LegendItem for demonstration
        LegendItem anotherLegendItem = new LegendItem("Another Legend");

        // Use ArrayList to store LegendItems
        ArrayList<LegendItem> legendList = new ArrayList<>();
        legendList.add(legendItem);
        legendList.add(anotherLegendItem);

        // Set series index for the first LegendItem
        /* write */ legendItem.setSeriesIndex(5);

        // Perform operations on another LegendItem
        anotherLegendItem.setSeriesIndex(10);

        // Iterate over the list and print details
        for (LegendItem item : legendList) {
            System.out.println("Legend: " + item.getLabel());
            System.out.println("Series Index: " + item.getSeriesIndex());
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 99: " + sum);

        // Read the series index of the first LegendItem
        /* read */ int seriesIndex = legendItem.getSeriesIndex();
        System.out.println("Read Series Index: " + seriesIndex);

        // More unrelated operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 2);
        }

        // Print the contents of numberList
        for (int number : numberList) {
            System.out.println("Number: " + number);
        }
    }
}