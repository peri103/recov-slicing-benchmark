import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "CustomPlot";
            }
        };
        
        Paint paint = Color.RED;
        /* write */ plot.setBackgroundPaint(paint);
        /* read */ Paint readPaint = plot.getBackgroundPaint();
        
        System.out.println(readPaint);
    }
}