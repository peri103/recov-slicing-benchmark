import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example");
        ArrayList<String> labels = new ArrayList<>();
        labels.add("Label1");
        labels.add("Label2");
        
        // Additional operations on LegendItem
        legendItem.setLabelFont(new Font("Arial", Font.BOLD, 12));
        legendItem.setDescription("This is a legend item");
        
        /* write */ legendItem.setLabelPaint(Color.RED);
        
        // More complex operations
        for (String label : labels) {
            legendItem.setLabel(label);
            Color currentPaint = legendItem.getLabelPaint();
            System.out.println("Current paint for label: " + label + " is " + currentPaint);
        }
        
        // Unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);
        
        /* read */ Color labelPaint = (Color) legendItem.getLabelPaint();
        System.out.println(labelPaint);
        
        // Further complex operations
        ArrayList<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        legendItems.add(new LegendItem("Another Example"));
        
        for (LegendItem item : legendItems) {
            System.out.println("Legend Item: " + item.getLabel());
        }
    }
}