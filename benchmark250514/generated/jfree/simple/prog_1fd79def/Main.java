import org.jfree.chart.renderer.xy.XYBarRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYBarRenderer renderer = new XYBarRenderer();
        int seriesIndex = 0;
        Paint outlinePaint = Color.RED;
        
        /* write */ renderer.setSeriesOutlinePaint(seriesIndex, outlinePaint);
        /* read */ Paint readOutlinePaint = renderer.getSeriesOutlinePaint(seriesIndex);
        
        System.out.println(readOutlinePaint);
    }
}