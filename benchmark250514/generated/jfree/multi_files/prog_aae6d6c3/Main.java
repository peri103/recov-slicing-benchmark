import org.jfree.chart.renderer.xy.XYBarRenderer;

public class Main {
    public static void main(String[] args) {
        RendererBase rendererBase = new RendererBase();
        rendererBase.setRendererBase(5.0);

        XYBarRenderer xyRenderer = new XYBarRenderer();
        xyRenderer.setBase(3.0);

        RendererAnalyzer analyzer = new RendererAnalyzer(rendererBase.getRenderer());
        double baseValue = analyzer.analyzeBaseValue();
        System.out.println("Base value from renderer: " + baseValue);

        if (baseValue > xyRenderer.getBase()) {
            System.out.println("Renderer's base value is greater than the xyRenderer's base value.");
        } else {
            System.out.println("Renderer's base value is not greater than the xyRenderer's base value.");
        }
    }
}