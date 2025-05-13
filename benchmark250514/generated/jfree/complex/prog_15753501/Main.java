import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample");
        ArrayList<LegendItem> legendItems = new ArrayList<>();

        // Add some LegendItem objects to the list
        for (int i = 0; i < 5; i++) {
            LegendItem item = new LegendItem("Item " + i);
            item.setFillPaint(new Color(50 * i, 50 * i, 50 * i));
            legendItems.add(item);
        }

        // Modify the first LegendItem in the list
        LegendItem firstItem = legendItems.get(0);
        firstItem.setFillPaint(Color.GREEN);

        // Original write operation
        /* write */ legendItem.setFillPaint(Color.RED);

        // Perform some operations with the list
        for (LegendItem item : legendItems) {
            System.out.println("LegendItem: " + item.getLabel() + ", FillPaint: " + item.getFillPaint());
        }

        // Calculate the average color intensity of the LegendItems in the list
        int totalRed = 0;
        for (LegendItem item : legendItems) {
            Color color = (Color) item.getFillPaint();
            totalRed += color.getRed();
        }
        int averageRed = totalRed / legendItems.size();
        System.out.println("Average Red Intensity: " + averageRed);

        // Original read operation
        /* read */ Paint fillPaint = legendItem.getFillPaint();
        System.out.println("Original LegendItem FillPaint: " + fillPaint);

        // Create another LegendItem and modify its properties
        LegendItem anotherItem = new LegendItem("Another Sample");
        anotherItem.setFillPaint(Color.BLUE);
        System.out.println("Another LegendItem FillPaint: " + anotherItem.getFillPaint());
    }
}