import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            // Providing an empty implementation for abstract methods
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };
        
        Paint paint = Color.BLUE;
        /* write */ plot.setBackgroundPaint(paint);
        /* read */ Paint readPaint = plot.getBackgroundPaint();
        
        System.out.println(readPaint);
    }
}