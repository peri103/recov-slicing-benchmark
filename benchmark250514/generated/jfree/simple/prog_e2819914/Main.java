import org.jfree.chart.renderer.xy.XYBarRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYBarRenderer renderer = new XYBarRenderer();
        Paint paint = new Color(255, 0, 0); // Red color
        int seriesIndex = 0;

        /* write */ renderer.setSeriesOutlinePaint(seriesIndex, paint);
        /* read */ Paint retrievedPaint = renderer.getSeriesOutlinePaint(seriesIndex);

        System.out.println(retrievedPaint);
    }
}