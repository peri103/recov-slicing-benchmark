import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        
        /* write */ legendItem.setLabelPaint(Color.RED);
        
        /* read */ Paint paint = legendItem.getLabelPaint();
        System.out.println(paint);
    }
}