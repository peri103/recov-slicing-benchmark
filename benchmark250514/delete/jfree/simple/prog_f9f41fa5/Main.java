import org.jfree.chart.renderer.xy.XYBubbleRenderer;

public class Main {
    public static void main(String[] args) {
        XYBubbleRenderer renderer = new XYBubbleRenderer();
        /* write */ renderer.setScaleType(XYBubbleRenderer.SCALE_ON_BOTH_AXES);
        /* read */ int scaleType = renderer.getScaleType();
        System.out.println("Scale Type: " + scaleType);
    }
}