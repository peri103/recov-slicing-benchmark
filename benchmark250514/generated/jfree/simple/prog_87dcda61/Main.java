import org.jfree.chart.plot.SpiderWebPlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null);
        /* write */ plot.setSeriesOutlinePaint(0, Color.RED);
        /* read */ java.awt.Paint paint = plot.getSeriesOutlinePaint(0);
        System.out.println(paint);
    }
}