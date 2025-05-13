import org.jfree.chart.renderer.xy.XYDotRenderer;

public class Main {
    public static void main(String[] args) {
        XYDotRenderer renderer = new XYDotRenderer();
        /* write */ renderer.setDotWidth(5);
        /* read */ int dotWidth = renderer.getDotWidth();
        System.out.println(dotWidth);
    }
}