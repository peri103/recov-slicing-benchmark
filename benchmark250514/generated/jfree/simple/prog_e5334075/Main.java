import org.jfree.chart.LegendItem;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        
        /* write */ legendItem.setLabelPaint(Color.RED);
        
        /* read */ java.awt.Paint paint = legendItem.getLabelPaint();
        
        System.out.println(paint);
    }
}