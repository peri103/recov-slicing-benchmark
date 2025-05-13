import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        Color shadowPaint = Color.GRAY;

        CategoryPlot categoryPlot = new CategoryPlot();
        BarRenderer barRenderer = new BarRenderer();
        barRenderer.setSeriesPaint(0, Color.BLUE);
        categoryPlot.setRenderer(barRenderer);

        /* write */ piePlot.setLabelShadowPaint(shadowPaint);

        // Simulating some complex operations
        for (int i = 0; i < 5; i++) {
            barRenderer.setSeriesPaint(i, new Color(50 * i, 100, 150));
            System.out.println("Set color for series " + i);
        }

        // More operations on categoryPlot
        categoryPlot.setDomainGridlinePaint(Color.RED);
        categoryPlot.setRangeGridlinePaint(Color.GREEN);

        // Further complex operations
        int totalSeries = 3;
        for (int i = 0; i < totalSeries; i++) {
            System.out.println("Series " + i + " color: " + barRenderer.getSeriesPaint(i));
        }

        /* read */ Color readShadowPaint = (Color) piePlot.getLabelShadowPaint();
        System.out.println(readShadowPaint);

        // Additional unrelated operations
        PiePlot anotherPiePlot = new PiePlot();
        anotherPiePlot.setLabelShadowPaint(Color.YELLOW);
        Color anotherShadowPaint = (Color) anotherPiePlot.getLabelShadowPaint();
        System.out.println("Another PiePlot shadow paint: " + anotherShadowPaint);
    }
}