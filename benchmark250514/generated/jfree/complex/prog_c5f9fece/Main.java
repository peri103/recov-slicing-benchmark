import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a BasicStroke object to set as the line stroke
        Stroke stroke = new BasicStroke(2.0f);

        // Additional objects to make the program more complex
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        HashMap<String, Color> colorMap = new HashMap<>();

        // Add some LegendItem instances to the list
        legendItems.add(new LegendItem("Legend 1"));
        legendItems.add(new LegendItem("Legend 2"));
        legendItems.add(legendItem);

        // Populate the color map with some values
        colorMap.put("Legend 1", Color.RED);
        colorMap.put("Legend 2", Color.BLUE);
        colorMap.put("Sample Legend", Color.GREEN);

        /* write */ legendItem.setLineStroke(stroke);

        // Perform operations on the list and map
        for (LegendItem item : legendItems) {
            System.out.println("Item: " + item.getLabel());
            Color color = colorMap.get(item.getLabel());
            if (color != null) {
                System.out.println("Color: " + color.toString());
            }
        }

        // Additional complex logic
        for (int i = 0; i < legendItems.size(); i++) {
            LegendItem item = legendItems.get(i);
            if ("Sample Legend".equals(item.getLabel())) {
                System.out.println("Found Sample Legend at index: " + i);
            }
        }

        /* read */ Stroke readStroke = legendItem.getLineStroke();

        // Output the result to verify the read value is the same as the written value
        System.out.println(readStroke.equals(stroke)); // Should print 'true'

        // Additional operations
        for (LegendItem item : legendItems) {
            if (item.getLabel().equals("Sample Legend")) {
                System.out.println("Sample Legend Stroke: " + item.getLineStroke());
            }
        }
    }
}