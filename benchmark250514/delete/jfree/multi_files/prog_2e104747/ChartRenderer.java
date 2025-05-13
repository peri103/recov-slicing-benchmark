import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class ChartRenderer {
    private XYLineAndShapeRenderer renderer;

    public ChartRenderer() {
        this.renderer = new XYLineAndShapeRenderer();
    }

    public void setShapesVisible(boolean visible) {
        /* write */ renderer.setShapesVisible(visible);
    }

    public boolean getShapesVisible() {
        return renderer.getShapesVisible();
    }

    public XYLineAndShapeRenderer getRenderer() {
        return renderer;
    }
}