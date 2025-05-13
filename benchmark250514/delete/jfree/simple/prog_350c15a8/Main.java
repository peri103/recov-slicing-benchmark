import org.jfree.chart.renderer.xy.XYShapeRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYShapeRenderer renderer = new XYShapeRenderer();
        Paint paint = Color.RED;
        /* write */ renderer.setOutlinePaint(paint);
        /* read */ Paint outlinePaint = renderer.getOutlinePaint();
        System.out.println(outlinePaint);
    }
}