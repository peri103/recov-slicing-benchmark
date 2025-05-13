import org.jfree.chart.LegendItem;
import java.awt.Color;

public class LegendDisplay {
    private LegendItem legendItem;

    public LegendDisplay(LegendItem legendItem) {
        this.legendItem = legendItem;
    }

    public void displayLegendDetails() {
        System.out.println("Legend: " + legendItem.getLabel());
        System.out.println("Font: " + legendItem.getLabelFont());

        /* read */ Color labelPaint = (Color) legendItem.getLabelPaint();
        System.out.println("Paint: " + labelPaint);
    }
}
