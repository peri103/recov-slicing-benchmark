import org.jfree.chart.plot.WaferMapPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        WaferMapPlot plot = new WaferMapPlot();
        Paint paint = Color.RED;
        
        /* write */ plot.setPaint(paint);
        /* read */ Paint retrievedPaint = plot.getPaint();
        
        System.out.println(retrievedPaint);
    }
}