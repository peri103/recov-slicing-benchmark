import org.jfree.chart.renderer.xy.XYShapeRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYShapeRenderer renderer = new XYShapeRenderer();
        Paint outlinePaint = Color.RED;
        
        /* write */ renderer.setOutlinePaint(outlinePaint);
        
        /* read */ Paint readOutlinePaint = renderer.getOutlinePaint();
        
        System.out.println(readOutlinePaint);
    }
}