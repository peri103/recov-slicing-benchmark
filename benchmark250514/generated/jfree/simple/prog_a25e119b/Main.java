import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYStepAreaRenderer object
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();

        // Define a series index and a color
        int seriesIndex = 0;
        Color paintColor = Color.RED;

        // Write operation: Set the paint color for the series
        /* write */ renderer.setSeriesPaint(seriesIndex, paintColor);

        // Read operation: Retrieve the paint color for the series
        /* read */ Paint retrievedPaint = renderer.getSeriesPaint(seriesIndex);

        // Print the retrieved paint color to ensure it matches the written value
        System.out.println(retrievedPaint);
    }
}