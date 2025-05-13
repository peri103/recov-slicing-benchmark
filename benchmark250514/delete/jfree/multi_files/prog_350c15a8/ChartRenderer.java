import org.jfree.chart.renderer.xy.XYShapeRenderer;
import java.awt.Paint;

public class ChartRenderer {
    private XYShapeRenderer shapeRenderer = new XYShapeRenderer();

    public void setOutlinePaint(Paint paint) {
        /* write */ shapeRenderer.setOutlinePaint(paint);
    }

    public Paint getOutlinePaint() {
        return shapeRenderer.getOutlinePaint();
    }
}
