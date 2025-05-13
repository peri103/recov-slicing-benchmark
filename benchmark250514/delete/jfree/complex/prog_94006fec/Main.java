import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem and set its fill paint
        LegendItem legendItem = new LegendItem("Sample Legend");
        Paint fillPaint = Color.RED;

        /* write */ legendItem.setFillPaint(fillPaint);

        // Create a list of LegendItems and add the legendItem to it
        List<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        
        // Create a map to store LegendItem descriptions and their fill paints
        Map<String, Paint> legendItemMap = new HashMap<>();
        for (LegendItem item : legendItems) {
            legendItemMap.put(item.getLabel(), item.getFillPaint());
        }

        // Perform some operations on the map
        for (String label : legendItemMap.keySet()) {
            System.out.println("Legend Item: " + label + ", Fill Paint: " + legendItemMap.get(label));
        }

        // More operations on the legendItems list
        for (LegendItem item : legendItems) {
            Paint currentPaint = item.getFillPaint();
            System.out.println("Current Fill Paint: " + currentPaint);
        }

        // Retrieve and print the fill paint using the read method
        /* read */ Paint readFillPaint = legendItem.getFillPaint();
        System.out.println("Fill Paint: " + readFillPaint);

        // Further operations with the LegendItem
        legendItem.setLabel("Updated Legend");
        Paint newPaint = Color.BLUE;
        legendItem.setFillPaint(newPaint);
        System.out.println("Updated Fill Paint: " + legendItem.getFillPaint());
    }
}