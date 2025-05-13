import org.jfree.chart.renderer.AbstractRenderer;
import java.awt.Paint;

public class RendererAnalyzer {
    private AbstractRenderer renderer;

    public RendererAnalyzer(AbstractRenderer renderer) {
        this.renderer = renderer;
    }

    public void analyzeRenderer() {
        // Analyze the renderer and print out details
        for (int i = 0; i < 5; i++) {
            Paint paint = renderer.getSeriesPaint(i);
            System.out.println("Paint for series " + i + ": " + paint);
        }
    }

    public Paint getSeriesPaint(int seriesIndex) {
        /* read */ return renderer.getSeriesPaint(seriesIndex);
    }
}
