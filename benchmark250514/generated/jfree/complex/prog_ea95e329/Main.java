import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot and set shadow paint
        PiePlot piePlot = new PiePlot();
        Paint shadowPaint = Color.GRAY;
        
        /* write */ piePlot.setShadowPaint(shadowPaint);
        
        // Perform other operations on PiePlot
        piePlot.setSectionOutlinesVisible(true);
        piePlot.setLabelGap(0.02);
        
        // Initialize CategoryPlot and BarRenderer
        CategoryPlot categoryPlot = new CategoryPlot();
        BarRenderer barRenderer = new BarRenderer();
        barRenderer.setSeriesPaint(0, Color.BLUE);
        barRenderer.setSeriesPaint(1, Color.RED);
        
        categoryPlot.setRenderer(barRenderer);
        
        // Perform operations with CategoryPlot
        categoryPlot.setDomainGridlinesVisible(true);
        categoryPlot.setRangeGridlinePaint(Color.BLACK);
        
        // Additional complex operations
        for (int i = 0; i < 5; i++) {
            categoryPlot.setRangeGridlinePaint(new Color(i * 50, i * 30, i * 20));
            System.out.println("Updated range gridline paint to: " + categoryPlot.getRangeGridlinePaint());
        }
        
        // Retrieve shadow paint from PiePlot
        /* read */ Paint retrievedShadowPaint = piePlot.getShadowPaint();
        
        // Print the result to verify the read value matches the written value
        System.out.println("Shadow paint retrieved from PiePlot: " + retrievedShadowPaint);
        
        // Further operations to increase complexity
        for (int i = 0; i < 3; i++) {
            barRenderer.setSeriesPaint(i, new Color(100 + i * 20, 50 + i * 10, 150 + i * 30));
            System.out.println("BarRenderer series paint updated for series " + i);
        }
    }
}