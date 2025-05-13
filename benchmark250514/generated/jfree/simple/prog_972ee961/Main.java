import org.jfree.chart.renderer.xy.XYShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYShapeRenderer renderer = new XYShapeRenderer();
        /* write */ renderer.setDrawOutlines(true);
        /* read */ boolean drawOutlines = renderer.getDrawOutlines();
        System.out.println(drawOutlines);
    }
}