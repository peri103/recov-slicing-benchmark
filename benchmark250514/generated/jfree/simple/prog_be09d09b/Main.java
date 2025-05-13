import org.jfree.chart.plot.SpiderWebPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null);
        Paint paint = Color.RED;
        
        /* write */ plot.setSeriesPaint(0, paint);
        
        /* read */ Paint retrievedPaint = plot.getSeriesPaint(0);
        
        System.out.println(retrievedPaint);
    }
}