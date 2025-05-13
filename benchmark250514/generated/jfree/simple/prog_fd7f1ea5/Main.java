import org.jfree.chart.renderer.xy.XYBarRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYBarRenderer renderer = new XYBarRenderer();
        
        /* write */ renderer.setSeriesOutlinePaint(0, Color.RED);
        
        /* read */ Paint paint = renderer.getSeriesOutlinePaint(0);
        
        System.out.println(paint);
    }
}