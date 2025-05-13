import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYDifferenceRenderer
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();

        // Set the positive paint color
        /* write */ renderer.setPositivePaint(Color.RED);

        // Retrieve the positive paint color
        /* read */ Paint positivePaint = renderer.getPositivePaint();

        // Print the retrieved paint color
        System.out.println(positivePaint);
    }
}