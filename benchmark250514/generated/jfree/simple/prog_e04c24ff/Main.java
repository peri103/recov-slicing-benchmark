import org.jfree.chart.plot.SpiderWebPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null);
        
        /* write */ plot.setSeriesOutlinePaint(0, Color.RED);
        
        /* read */ Paint paint = plot.getSeriesOutlinePaint(0);
        
        System.out.println(paint);
    }
}