import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

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
        
        // Create an XYPlot and set its background paint
        XYPlot xyPlot = new XYPlot();
        xyPlot.setBackgroundPaint(Color.BLUE);
        
        // Create a list of plots
        ArrayList<Plot> plotList = new ArrayList<>();
        plotList.add(plot);
        plotList.add(xyPlot);
        
        // Manipulate the list
        for (Plot p : plotList) {
            System.out.println("Plot type: " + p.getPlotType());
        }
        
        // Further operations on the XYPlot
        Paint xyPlotPaint = xyPlot.getBackgroundPaint();
        System.out.println("XYPlot Background Paint: " + xyPlotPaint);
        
        // Retrieve the background paint of the original plot
        /* read */ Paint readPaint = plot.getBackgroundPaint();
        System.out.println(readPaint);
        
        // Additional operations
        for (int i = 0; i < 5; i++) {
            plotList.add(new Plot() {
                @Override
                public String getPlotType() {
                    return "GeneratedPlot" + i;
                }
            });
        }
        
        // Print details of all plots
        for (Plot p : plotList) {
            System.out.println("Plot type: " + p.getPlotType());
        }
    }
}