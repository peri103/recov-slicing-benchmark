import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample");
        /* write */ legendItem.setFillPaint(Color.RED);
        /* read */ Paint fillPaint = legendItem.getFillPaint();
        System.out.println(fillPaint);
    }
}