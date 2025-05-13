import org.jfree.chart.plot.SpiderWebPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null);
        Map<Integer, Paint> paintMap = new HashMap<>();
        
        // Adding initial series outline paints
        paintMap.put(0, Color.BLUE);
        paintMap.put(1, Color.GREEN);
        paintMap.put(2, Color.YELLOW);
        
        // Setting series outline paints from the map
        for (Map.Entry<Integer, Paint> entry : paintMap.entrySet()) {
            plot.setSeriesOutlinePaint(entry.getKey(), entry.getValue());
        }
        
        // Update paint for a specific series
        /* write */ plot.setSeriesOutlinePaint(0, Color.RED);
        
        // Perform some operations
        int seriesCount = paintMap.size();
        for (int i = 0; i < seriesCount; i++) {
            Paint currentPaint = plot.getSeriesOutlinePaint(i);
            System.out.println("Series " + i + " has outline paint: " + currentPaint);
        }
        
        // Retrieve the updated paint for series 0
        /* read */ Color color = (Color) plot.getSeriesOutlinePaint(0);
        System.out.println("Updated paint for series 0: " + color);
        
        // Adding more series with different outline paints
        paintMap.put(3, Color.ORANGE);
        paintMap.put(4, Color.MAGENTA);
        
        for (Map.Entry<Integer, Paint> entry : paintMap.entrySet()) {
            plot.setSeriesOutlinePaint(entry.getKey(), entry.getValue());
        }
        
        // Output all series paints
        for (int i = 0; i < paintMap.size(); i++) {
            Paint paint = plot.getSeriesOutlinePaint(i);
            System.out.println("Series " + i + " paint: " + paint);
        }
    }
}