import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        BarRenderer renderer = new BarRenderer();
        
        // Setting up a renderer for category plot
        renderer.setSeriesPaint(0, Color.BLUE);
        categoryPlot.setRenderer(renderer);
        
        // Performing operations on the PiePlot
        /* write */ piePlot.setLabelOutlinePaint(Color.RED);
        
        // Additional logic to manipulate category plot
        categoryPlot.setRangeGridlinePaint(Color.GREEN);
        Color gridlineColor = categoryPlot.getRangeGridlinePaint();
        System.out.println("Category Plot Range Gridline Paint: " + gridlineColor);
        
        // Further operations on PiePlot
        piePlot.setInteriorGap(0.05);
        double gap = piePlot.getInteriorGap();
        System.out.println("PiePlot Interior Gap: " + gap);
        
        // Retrieve the label outline paint from PiePlot
        /* read */ Color labelOutlineColor = (Color) piePlot.getLabelOutlinePaint();
        System.out.println("PiePlot Label Outline Paint: " + labelOutlineColor);
        
        // Performing additional operations
        renderer.setSeriesPaint(1, Color.YELLOW);
        categoryPlot.setRenderer(renderer);
        Color seriesPaint = renderer.getSeriesPaint(1);
        System.out.println("Renderer Series Paint: " + seriesPaint);
    }
}