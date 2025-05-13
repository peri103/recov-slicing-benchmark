import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        
        ArrayList<String> labels = new ArrayList<>();
        labels.add("First");
        labels.add("Second");
        
        HashMap<String, Color> labelColors = new HashMap<>();
        labelColors.put("First", Color.BLUE);
        labelColors.put("Second", Color.GREEN);
        
        /* write */ legendItem.setLabelPaint(Color.RED);

        // Perform some unrelated operations
        for (String label : labels) {
            Color color = labelColors.get(label);
            System.out.println("Label: " + label + ", Color: " + color);
        }

        // More complex operations
        for (int i = 0; i < labels.size(); i++) {
            if (i % 2 == 0) {
                labels.set(i, labels.get(i) + " Modified");
            }
        }
        
        // Final operations before reading the value
        java.awt.Paint paint = legendItem.getLabelPaint();
        /* read */ System.out.println("Legend Item Label Paint: " + paint);

        // Additional operations
        for (String label : labels) {
            System.out.println("Updated Label: " + label);
        }
    }
}