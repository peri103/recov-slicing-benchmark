import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import org.jfree.chart.plot.Plot;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);
        
        /* write */ legendItem.setShape(shape);
        
        // Additional complex code
        LegendItem anotherLegendItem = new LegendItem("Another Legend");
        anotherLegendItem.setLabelPaint(Color.BLUE);
        anotherLegendItem.setOutlinePaint(Color.RED);
        
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Sample Plot";
            }
        };
        
        plot.setBackgroundPaint(Color.YELLOW);
        plot.setOutlinePaint(Color.BLACK);

        // Simulate some operations on the plot
        double plotArea = 100.0;
        double plotWidth = plotArea / 10;
        double plotHeight = plotArea / 5;
        Shape plotShape = new Rectangle2D.Double(0, 0, plotWidth, plotHeight);
        anotherLegendItem.setShape(plotShape);

        System.out.println("Plot Type: " + plot.getPlotType());
        System.out.println("Plot Shape: " + plotShape);

        // Retrieve the shape set earlier
        /* read */ Shape retrievedShape = legendItem.getShape();
        
        System.out.println("Retrieved Shape: " + retrievedShape);
    }
}