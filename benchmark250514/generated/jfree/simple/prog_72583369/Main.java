import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        int seriesIndex = 0;
        Paint fillPaint = Color.RED;
        
        /* write */ renderer.setSeriesFillPaint(seriesIndex, fillPaint);
        /* read */ Paint retrievedFillPaint = renderer.getSeriesFillPaint(seriesIndex);
        
        System.out.println(retrievedFillPaint);
    }
}