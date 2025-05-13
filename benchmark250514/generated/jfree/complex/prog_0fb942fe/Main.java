import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example");
        ArrayList<Color> colorList = new ArrayList<>();
        
        // Initialize some colors
        colorList.add(Color.BLUE);
        colorList.add(Color.GREEN);
        colorList.add(Color.YELLOW);

        // Set the line paint of the legend item
        /* write */ legendItem.setLinePaint(Color.RED);

        // Perform operations using colorList
        for (Color color : colorList) {
            System.out.println("Color in list: " + color);
        }
        
        // Use legendItem in a different context
        LegendItem anotherLegendItem = new LegendItem("Another Example");
        anotherLegendItem.setLinePaint(colorList.get(0));
        
        // Calculate something unrelated
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        // Finally read the line paint color
        /* read */ Color linePaintColor = (Color) legendItem.getLinePaint();
        System.out.println("Line Paint Color: " + linePaintColor);

        // Further operations with anotherLegendItem
        Color anotherLinePaintColor = (Color) anotherLegendItem.getLinePaint();
        System.out.println("Another Line Paint Color: " + anotherLinePaintColor);
    }
}