import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Use the write method to set the label paint
        /* write */ legendItem.setLabelPaint(Color.RED);

        // Create an ArrayList to store multiple LegendItems
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);

        // Create a HashMap to map LegendItems to their labels
        HashMap<String, LegendItem> legendMap = new HashMap<>();
        for (LegendItem item : legendItems) {
            legendMap.put(item.getLabel(), item);
        }

        // Manipulate the LegendItems in some way
        for (LegendItem item : legendItems) {
            item.setLabelPaint(Color.BLUE);
            System.out.println("Updated label paint to BLUE for item: " + item.getLabel());
        }

        // Use the read method to get the label paint
        /* read */ Paint labelPaint = legendItem.getLabelPaint();

        // Output the result to verify the read value is the same as the written value
        System.out.println("Final label paint: " + labelPaint);

        // Further manipulate the HashMap
        for (String key : legendMap.keySet()) {
            LegendItem item = legendMap.get(key);
            System.out.println("LegendItem label: " + item.getLabel() + ", Paint: " + item.getLabelPaint());
        }
    }
}