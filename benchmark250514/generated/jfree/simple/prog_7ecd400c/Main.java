import org.jfree.chart.plot.SpiderWebPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null);
        Paint paint = new Color(255, 0, 0); // Red color

        /* write */ plot.setSeriesOutlinePaint(0, paint);
        /* read */ Paint retrievedPaint = plot.getSeriesOutlinePaint(0);

        System.out.println(retrievedPaint);
    }
}