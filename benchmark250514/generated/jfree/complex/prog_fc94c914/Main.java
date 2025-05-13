import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Random random = new Random();
        
        // Set up a random color generator
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};
        int randomIndex = random.nextInt(colors.length);
        Color randomColor = colors[randomIndex];

        // Perform various operations on the PiePlot
        plot.setSectionPaint(0, randomColor);
        plot.setSectionOutlinePaint(1, Color.BLACK);

        // Add some complexity by modifying and reading other properties
        plot.setBackgroundPaint(Color.GRAY);
        Paint backgroundPaint = plot.getBackgroundPaint();
        System.out.println("Background paint: " + backgroundPaint);

        // Set label background paint
        /* write */ plot.setLabelBackgroundPaint(Color.RED);

        // Perform unrelated operations
        plot.setLabelShadowPaint(Color.DARK_GRAY);
        Paint shadowPaint = plot.getLabelShadowPaint();
        System.out.println("Shadow paint: " + shadowPaint);

        // Read the label background paint
        /* read */ Paint labelBackgroundPaint = plot.getLabelBackgroundPaint();
        System.out.println("Label background paint: " + labelBackgroundPaint);

        // Additional unrelated operations
        plot.setLabelOutlinePaint(Color.ORANGE);
        Paint outlinePaint = plot.getLabelOutlinePaint();
        System.out.println("Outline paint: " + outlinePaint);
    }
}