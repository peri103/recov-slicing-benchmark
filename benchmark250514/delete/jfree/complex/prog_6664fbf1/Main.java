import org.jfree.chart.plot.PiePlot;
import java.awt.Font;
import java.awt.Color;
import org.jfree.chart.plot.Plot;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Font font = new Font("Serif", Font.PLAIN, 12);
        
        /* write */ plot.setLabelFont(font);

        // Add some unrelated logic to make the program more complex
        Font titleFont = new Font("Arial", Font.BOLD, 16);
        plot.setLabelPaint(Color.BLUE);
        plot.setBackgroundPaint(Color.LIGHT_GRAY);
        
        Plot anotherPlot = new PiePlot();
        anotherPlot.setBackgroundPaint(Color.GREEN);
        anotherPlot.setOutlinePaint(Color.YELLOW);
        
        Font anotherFont = new Font("Courier", Font.ITALIC, 10);
        ((PiePlot)anotherPlot).setLabelFont(anotherFont);
        
        // Perform some operations on the unrelated plot
        Color outlineColor = anotherPlot.getOutlinePaint();
        System.out.println("Outline color: " + outlineColor);

        // Back to the original plot
        Color labelColor = plot.getLabelPaint();
        System.out.println("Label color: " + labelColor);

        /* read */ Font readFont = plot.getLabelFont();
        
        System.out.println("Font name: " + readFont.getName());
        System.out.println("Font style: " + readFont.getStyle());
        System.out.println("Font size: " + readFont.getSize());

        // Additional unrelated logic
        Font retrievedFont = ((PiePlot)anotherPlot).getLabelFont();
        System.out.println("Another font name: " + retrievedFont.getName());
        System.out.println("Another font style: " + retrievedFont.getStyle());
        System.out.println("Another font size: " + retrievedFont.getSize());
    }
}