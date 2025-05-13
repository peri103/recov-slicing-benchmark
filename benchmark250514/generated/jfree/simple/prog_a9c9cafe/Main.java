import org.jfree.chart.renderer.xy.XYSplineRenderer;

public class Main {
    public static void main(String[] args) {
        XYSplineRenderer renderer = new XYSplineRenderer();
        /* write */ renderer.setPrecision(5);
        /* read */ int precision = renderer.getPrecision();
        System.out.println(precision);
    }
}