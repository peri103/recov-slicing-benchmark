import org.jfree.chart.plot.Plot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "CustomPlot";
            }
        };
        
        /* write */ plot.setBackgroundPaint(Color.BLUE);
        /* read */ Color backgroundPaint = (Color) plot.getBackgroundPaint();
        
        System.out.println("Background paint color: " + backgroundPaint.toString());
    }
}