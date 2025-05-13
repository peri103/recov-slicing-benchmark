import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };
        
        /* write */ plot.setBackgroundPaint(Color.BLUE);
        
        /* read */ Paint backgroundPaint = plot.getBackgroundPaint();
        
        System.out.println("Background Paint: " + backgroundPaint);
    }
}