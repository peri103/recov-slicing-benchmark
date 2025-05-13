import org.jfree.chart.plot.Plot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            // Implement abstract methods with dummy implementations
            public String getPlotType() { return ""; }
            protected void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, 
                                org.jfree.chart.plot.PlotState state, 
                                org.jfree.chart.plot.PlotRenderingInfo info) {}
        };

        /* write */ plot.setBackgroundPaint(Color.BLUE);
        /* read */ java.awt.Paint backgroundPaint = plot.getBackgroundPaint();
        
        System.out.println(backgroundPaint);
    }
}