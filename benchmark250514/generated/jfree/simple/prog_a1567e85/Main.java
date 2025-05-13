import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        /* write */ renderer.setSeriesFillPaint(0, Color.BLUE);
        /* read */ java.awt.Paint fillPaint = renderer.getSeriesFillPaint(0);
        System.out.println(fillPaint);
    }
}