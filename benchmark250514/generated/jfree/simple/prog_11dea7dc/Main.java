import org.jfree.chart.plot.SpiderWebPlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null);
        
        /* write */ plot.setSeriesPaint(0, Color.RED);
        
        /* read */ Color seriesPaint = (Color) plot.getSeriesPaint(0);
        
        System.out.println(seriesPaint);
    }
}