import org.jfree.chart.LegendItem;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example Legend Item");
        Paint paint = Color.RED;
        
        /* write */ legendItem.setFillPaint(paint);
        /* read */ Paint retrievedPaint = legendItem.getFillPaint();
        
        System.out.println(retrievedPaint);
    }
}