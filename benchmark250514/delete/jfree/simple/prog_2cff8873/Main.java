import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        Color negativePaint = Color.RED;

        /* write */ renderer.setNegativePaint(negativePaint);
        /* read */ Color readNegativePaint = renderer.getNegativePaint();

        System.out.println("Negative Paint Color: " + readNegativePaint.toString());
    }
}