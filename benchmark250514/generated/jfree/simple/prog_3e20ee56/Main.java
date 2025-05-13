import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        
        /* write */ renderer.setNegativePaint(Color.RED);
        
        /* read */ Color negativePaint = (Color) renderer.getNegativePaint();
        
        System.out.println(negativePaint);
    }
}