import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYAreaRenderer renderer = new XYAreaRenderer();
        Paint fillPaint = new Color(255, 0, 0); // Red color

        /* write */ renderer.setSeriesFillPaint(0, fillPaint);
        /* read */ Paint retrievedPaint = renderer.getSeriesFillPaint(0);

        System.out.println(retrievedPaint);
    }
}