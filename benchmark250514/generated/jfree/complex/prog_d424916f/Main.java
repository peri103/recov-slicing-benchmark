import org.jfree.chart.plot.PiePlot;
import java.awt.Font;
import java.awt.Color;
import org.jfree.chart.plot.Plot;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Font font = new Font("Serif", Font.PLAIN, 12);
        Font anotherFont = new Font("SansSerif", Font.BOLD, 14);
        
        /* write */ plot.setLabelFont(font);
        
        // Additional code to manipulate plot properties
        plot.setBackgroundPaint(Color.LIGHT_GRAY);
        plot.setSectionPaint("Section1", Color.RED);
        plot.setSectionPaint("Section2", Color.BLUE);
        
        // Unrelated operations
        int numSections = 5;
        for (int i = 0; i < numSections; i++) {
            plot.setSectionPaint("Section" + (i + 3), new Color(50 * i, 100, 150));
        }
        
        // More operations on PiePlot
        if (plot.getBackgroundPaint() instanceof Color) {
            Color bgColor = (Color) plot.getBackgroundPaint();
            System.out.println("Background color: " + bgColor);
        }
        
        // Setting another font for a different section
        plot.setLabelFont(anotherFont);

        // Operations on unrelated object
        Plot anotherPlot = new PiePlot();
        anotherPlot.setBackgroundPaint(Color.YELLOW);
        
        // Finally read the label font
        /* read */ Font readFont = plot.getLabelFont();
        
        System.out.println("Read Font: " + readFont);
    }
}