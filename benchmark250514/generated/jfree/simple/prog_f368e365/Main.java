import org.jfree.chart.renderer.xy.XYDotRenderer;

public class Main {
    public static void main(String[] args) {
        XYDotRenderer renderer = new XYDotRenderer();
        /* write */ renderer.setDotHeight(5);
        /* read */ int dotHeight = renderer.getDotHeight();
        System.out.println(dotHeight);
    }
}