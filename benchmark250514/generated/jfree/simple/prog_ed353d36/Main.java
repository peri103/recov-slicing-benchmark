import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Paint fillPaint = Color.RED;

        /* write */ renderer.setSeriesFillPaint(0, fillPaint);

        /* read */ Paint retrievedPaint = renderer.getSeriesFillPaint(0);
        System.out.println(retrievedPaint);
    }
}