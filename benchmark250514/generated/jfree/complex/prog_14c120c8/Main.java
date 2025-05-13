import org.jfree.chart.plot.PolarPlot;
import java.awt.Color;
import java.awt.BasicStroke;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        PolarPlot plot = new PolarPlot();
        XYPlot xyPlot = new XYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        // Setting up the XY plot with a renderer
        renderer.setSeriesPaint(0, Color.BLUE);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        xyPlot.setRenderer(renderer);
        
        // Additional operations on PolarPlot
        plot.setRadiusGridlinePaint(Color.GREEN);
        plot.setRadiusGridlineStroke(new BasicStroke(1.5f));
        
        // Manipulating angle gridline paint
        /* write */ plot.setAngleGridlinePaint(Color.RED);
        
        // More operations on XY plot
        xyPlot.setDomainGridlinePaint(Color.YELLOW);
        xyPlot.setRangeGridlineStroke(new BasicStroke(0.5f));
        
        // Reading the angle gridline paint
        /* read */ Color angleGridlinePaint = (Color) plot.getAngleGridlinePaint();
        System.out.println("Angle Gridline Paint: " + angleGridlinePaint);
        
        // Additional operations on renderer
        renderer.setSeriesShapesVisible(0, true);
        renderer.setSeriesLinesVisible(0, true);
        
        // Final operations on PolarPlot
        plot.setBackgroundPaint(Color.WHITE);
        plot.setOutlinePaint(Color.BLACK);
        
        // Printing some information
        System.out.println("XYPlot Domain Gridline Paint: " + xyPlot.getDomainGridlinePaint());
        System.out.println("XYPlot Range Gridline Stroke: " + xyPlot.getRangeGridlineStroke());
    }
}