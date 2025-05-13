import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a Stroke object to set
        Stroke stroke = new BasicStroke(2.0f);

        // Use the write method to set the line stroke
        /* write */ legendItem.setLineStroke(stroke);

        // Create a list of colors and add some colors to it
        List<Color> colorList = new ArrayList<>();
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.BLUE);

        // Iterate over the list and print each color
        for (Color color : colorList) {
            System.out.println("Color: " + color);
        }

        // Create another LegendItem and set properties
        LegendItem anotherLegendItem = new LegendItem("Another Sample");
        anotherLegendItem.setLineStroke(new BasicStroke(3.0f));
        anotherLegendItem.setLinePaint(Color.ORANGE);

        // Use the read method to get the line stroke
        /* read */ Stroke readStroke = legendItem.getLineStroke();

        // Print the result to verify correctness
        System.out.println("Read Stroke equals set Stroke: " + readStroke.equals(stroke));

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Print properties of anotherLegendItem
        System.out.println("Another Legend Item Line Stroke: " + anotherLegendItem.getLineStroke());
        System.out.println("Another Legend Item Line Paint: " + anotherLegendItem.getLinePaint());
    }
}