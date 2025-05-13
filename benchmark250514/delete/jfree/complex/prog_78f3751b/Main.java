import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };
        
        // Additional code to make the program more complex
        List<Plot> plotList = new ArrayList<>();
        plotList.add(plot);
        
        for (Plot p : plotList) {
            System.out.println("Plot type: " + p.getPlotType());
        }
        
        // Another plot instance with different background
        Plot anotherPlot = new Plot() {
            @Override
            public String getPlotType() {
                return "Another Custom Plot";
            }
        };
        anotherPlot.setBackgroundPaint(Color.BLUE);
        
        Paint anotherBackgroundPaint = anotherPlot.getBackgroundPaint();
        System.out.println("Another plot background: " + anotherBackgroundPaint);
        
        /* write */ plot.setBackgroundPaint(Color.RED);
        
        // Adding more operations
        List<Color> colorHistory = new ArrayList<>();
        colorHistory.add(Color.RED);
        colorHistory.add(Color.BLUE);
        
        for (Color color : colorHistory) {
            System.out.println("Color history: " + color);
        }
        
        /* read */ Paint backgroundPaint = plot.getBackgroundPaint();
        
        System.out.println("Original plot background: " + backgroundPaint);
        
        // Final operations to demonstrate complexity
        for (int i = 0; i < 3; i++) {
            plotList.add(new Plot() {
                @Override
                public String getPlotType() {
                    return "Generated Plot " + i;
                }
            });
        }
        
        for (Plot p : plotList) {
            System.out.println("Final plot type: " + p.getPlotType());
        }
    }
}