import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();

        // Create a Color object to set as the label background paint
        Color labelBackgroundColor = new Color(255, 0, 0); // Red color

        /* write */ piePlot.setLabelBackgroundPaint(labelBackgroundColor);

        /* read */ Paint retrievedPaint = piePlot.getLabelBackgroundPaint();

        System.out.println("Retrieved Paint: " + retrievedPaint);
    }
}