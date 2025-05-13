import org.jfree.chart.plot.FastScatterPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        FastScatterPlot plot = new FastScatterPlot();
        Paint paint = Color.RED;
        
        /* write */ plot.setDomainGridlinePaint(paint);
        /* read */ Paint readPaint = plot.getDomainGridlinePaint();
        
        System.out.println(readPaint);
    }
}