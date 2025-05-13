import org.jfree.chart.renderer.xy.XYShapeRenderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYShapeRenderer renderer = new XYShapeRenderer();
        /* write */ renderer.setOutlinePaint(Color.RED);
        /* read */ java.awt.Paint outlinePaint = renderer.getOutlinePaint();
        System.out.println(outlinePaint);
    }
}