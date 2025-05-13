import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Stroke;

public class RendererTest {
    private RendererUtil rendererUtil;

    public RendererTest() {
        this.rendererUtil = new RendererUtil();
    }

    public void performTest() {
        rendererUtil.configureRenderer();
        XYStepAreaRenderer renderer = rendererUtil.getRenderer();
        Stroke expectedStroke = rendererUtil.getStroke();
        
        /* read */ Stroke retrievedStroke = renderer.getSeriesOutlineStroke(0);
        System.out.println("Is the stroke set correctly? " + retrievedStroke.equals(expectedStroke));
    }
}
