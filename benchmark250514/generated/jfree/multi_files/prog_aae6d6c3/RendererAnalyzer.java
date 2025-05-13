import org.jfree.chart.renderer.xy.StackedXYBarRenderer;

public class RendererAnalyzer {
    private StackedXYBarRenderer renderer;

    public RendererAnalyzer(StackedXYBarRenderer renderer) {
        this.renderer = renderer;
    }

    public double analyzeBaseValue() {
        /* read */ double baseValue = renderer.getBase();
        return baseValue;
    }
}
