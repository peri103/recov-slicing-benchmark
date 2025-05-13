import org.jfree.chart.plot.FastScatterPlot;
import java.awt.Paint;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        FastScatterPlot plot = new FastScatterPlot();
        Paint paint = Color.RED;
        /* write */ plot.setDomainGridlinePaint(paint);
        /* read */ Paint retrievedPaint = plot.getDomainGridlinePaint();
        System.out.println(retrievedPaint);
    }
}