import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");

        ArrayList<LegendItem> legendList = new ArrayList<>();
        legendList.add(legendItem);

        LegendItem anotherLegendItem = new LegendItem("Another Legend");
        anotherLegendItem.setLabelPaint(Color.BLUE);
        legendList.add(anotherLegendItem);

        for (LegendItem item : legendList) {
            System.out.println("Initial Paint: " + item.getLabelPaint());
        }

        /* write */ legendItem.setLabelPaint(Color.RED);

        for (LegendItem item : legendList) {
            if (item.getLabelPaint().equals(Color.RED)) {
                System.out.println("Found a legend with red paint.");
            }
        }

        /* read */ Paint paint = legendItem.getLabelPaint();

        System.out.println("Final Paint: " + paint);

        for (LegendItem item : legendList) {
            System.out.println("Legend: " + item.getLabelPaint());
        }

        LegendItem thirdLegendItem = new LegendItem("Third Legend");
        thirdLegendItem.setLabelPaint(Color.GREEN);
        legendList.add(thirdLegendItem);

        for (LegendItem item : legendList) {
            System.out.println("Updated Legend Paints: " + item.getLabelPaint());
        }
    }
}