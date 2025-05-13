import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Paint fillPaint = Color.RED;

        /* write */ legendItem.setFillPaint(fillPaint);
        /* read */ Paint readFillPaint = legendItem.getFillPaint();

        System.out.println("Fill Paint: " + readFillPaint);
    }
}