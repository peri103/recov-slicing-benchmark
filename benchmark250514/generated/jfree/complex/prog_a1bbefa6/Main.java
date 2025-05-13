import org.jfree.chart.plot.PiePlot;
import java.awt.Font;
import org.jfree.chart.plot.CategoryPlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot and set label font
        PiePlot piePlot = new PiePlot();
        Font font = new Font("Arial", Font.PLAIN, 12);
        /* write */ piePlot.setLabelFont(font);

        // Initialize CategoryPlot and set background color
        CategoryPlot categoryPlot = new CategoryPlot();
        categoryPlot.setBackgroundPaint(Color.BLUE);

        // Perform some operations on CategoryPlot
        categoryPlot.setRangeGridlinePaint(Color.RED);
        categoryPlot.setOutlinePaint(Color.GREEN);
        
        // Initialize another PiePlot for additional operations
        PiePlot anotherPiePlot = new PiePlot();
        anotherPiePlot.setLabelFont(new Font("Courier New", Font.BOLD, 14));

        // Retrieve and print the label font from the original PiePlot
        /* read */ Font retrievedFont = piePlot.getLabelFont();
        System.out.println("Font Name: " + retrievedFont.getFontName());
        System.out.println("Font Style: " + retrievedFont.getStyle());
        System.out.println("Font Size: " + retrievedFont.getSize());

        // Perform operations on the second PiePlot
        Font anotherRetrievedFont = anotherPiePlot.getLabelFont();
        System.out.println("Another Font Name: " + anotherRetrievedFont.getFontName());
        System.out.println("Another Font Style: " + anotherRetrievedFont.getStyle());
        System.out.println("Another Font Size: " + anotherRetrievedFont.getSize());

        // Additional logic for complexity
        for (int i = 0; i < 5; i++) {
            categoryPlot.setDomainGridlinePaint(new Color(i * 50, i * 50, i * 50));
            System.out.println("Domain Gridline Paint Color: " + categoryPlot.getDomainGridlinePaint());
        }
    }
}