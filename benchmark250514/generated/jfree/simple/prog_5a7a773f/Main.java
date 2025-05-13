import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Define the series index and paint color
        int seriesIndex = 0;
        Paint paintColor = Color.RED;
        
        /* write */ renderer.setSeriesOutlinePaint(seriesIndex, paintColor);
        
        /* read */ Paint retrievedPaint = renderer.getSeriesOutlinePaint(seriesIndex);
        
        System.out.println(retrievedPaint);
    }
}