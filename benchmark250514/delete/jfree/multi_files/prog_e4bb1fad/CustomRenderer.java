import org.jfree.chart.renderer.Renderer;
import org.jfree.chart.renderer.AbstractRenderer;
import java.awt.BasicStroke;

public class CustomRenderer extends AbstractRenderer {
    public void setCustomStroke(BasicStroke stroke) {
        /* write */ setBaseStroke(stroke);
    }

    public BasicStroke getCustomStroke() {
        return getBaseStroke();
    }
}
