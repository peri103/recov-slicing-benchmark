import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Item");
        LegendItem anotherLegendItem = new LegendItem("Another Item");

        List<LegendItem> legendItems = new ArrayList<>();
        legendItems.add(legendItem);
        legendItems.add(anotherLegendItem);

        /* write */ legendItem.setLabelPaint(Color.RED);

        anotherLegendItem.setLabelPaint(Color.BLUE);

        for (LegendItem item : legendItems) {
            if (item.equals(legendItem)) {
                System.out.println("Processing the main legend item.");
            } else {
                System.out.println("Processing another legend item.");
            }
        }

        Paint paint = anotherLegendItem.getLabelPaint();
        System.out.println("Another Legend Item Paint: " + paint);

        /* read */ Paint legendItemPaint = legendItem.getLabelPaint();
        System.out.println("Legend Item Paint: " + legendItemPaint);

        for (LegendItem item : legendItems) {
            Paint currentPaint = item.getLabelPaint();
            System.out.println("Current Legend Item Paint: " + currentPaint);
        }
    }
}