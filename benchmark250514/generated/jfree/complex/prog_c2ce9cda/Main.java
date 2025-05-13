import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a Stroke object to set
        Stroke stroke = new BasicStroke(2.0f);

        // Write operation: set the line stroke
        /* write */ legendItem.setLineStroke(stroke);

        // Additional code to add complexity
        ArrayList<LegendItem> legendItemList = new ArrayList<>();
        HashMap<String, LegendItem> legendItemMap = new HashMap<>();

        // Add LegendItem to the list and map
        legendItemList.add(legendItem);
        legendItemMap.put("legend1", legendItem);

        // Iterate through the list and modify items
        for (LegendItem item : legendItemList) {
            Stroke newStroke = new BasicStroke(3.0f);
            item.setLineStroke(newStroke);
        }

        // Retrieve and print values from the map
        LegendItem retrievedItem = legendItemMap.get("legend1");
        Stroke mapStroke = retrievedItem.getLineStroke();
        System.out.println("Stroke from map: " + mapStroke);

        // Read operation: get the line stroke
        /* read */ Stroke retrievedStroke = legendItem.getLineStroke();

        // Print the result to verify
        System.out.println("Original stroke: " + retrievedStroke);

        // Further complexity: manipulate a list of strokes
        ArrayList<Stroke> strokeList = new ArrayList<>();
        strokeList.add(stroke);
        strokeList.add(new BasicStroke(4.0f));

        for (Stroke s : strokeList) {
            System.out.println("Stroke in list: " + s);
        }
    }
}